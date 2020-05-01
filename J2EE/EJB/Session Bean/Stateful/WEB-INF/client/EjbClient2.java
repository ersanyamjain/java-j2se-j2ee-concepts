import javax.naming.*;
import myejb.*;
import java.util.*;

public class EjbClient2
{
	public static void main(String args[]) throws Exception
	{
		Properties parm=new Properties();
		parm.setProperty("java.naming.factory.initial","weblogic.jndi.WLInitialContextFactory");
		System.out.println("Hello");
		parm.setProperty("java.naming.factory.url","t3://localhost:7001");
		parm.setProperty("java.naming.security.principal","weblogic");
		parm.setProperty("java.naming.security.credentials","weblogic");
		InitialContext ctx=new InitialContext(parm);
		Fund fund[]=new Fund[1000];
		for(int i=0;i<fund.length;i++)
		{
		fund[i]=(Fund)ctx.lookup("myAccount15#myejb.Fund");
		fund[i].deposite(250.50);
		double passAmt=fund[i].getAmount();
		System.out.println(passAmt);
		fund[i].withdraw(50.50);
		passAmt=fund[i].getAmount();
		System.out.println(passAmt);
		
		System.out.println("Count: "+(i+1));
		try
		{
			//Thread.sleep(1000);
		}
		catch(Exception e){}
	}
}