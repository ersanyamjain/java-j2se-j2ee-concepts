import javax.naming.*;
import myejb.*;
import java.util.*;

public class EjbClient1
{
	public static void main(String args[]) throws Exception
	{
		Properties parm=new Properties();
		parm.setProperty("java.naming.factory.url","t3://localhost:7001");
		parm.setProperty("java.naming.security.principal","weblogic");
		parm.setProperty("java.naming.security.credentials","weblogic");
		InitialContext ctx=new InitialContext(parm);
		Fund fund=(Fund)ctx.lookup("myAccount15#myejb.Fund");
		fund.deposite(250.50);
		double passAmt=fund.getAmount();
		System.out.println(passAmt);
		fund.withdraw(50.50);
		passAmt=fund.getAmount();
		System.out.println(passAmt);
	}
}