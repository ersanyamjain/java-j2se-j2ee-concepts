import javax.naming.*;
import mypack.Addder;
import java.util.*;

public class EjbClient1
{
	public static void main(String args[]) throws Exception
	{
		Properties parm=new Properties();
		parm.setProperty("java.naming.factory.initial","weblogic.jndi.WLInitialContextFactory");
		parm.setProperty("java.naming.provider.url","http://localhost:7001");
		parm.setProperty("java.naming.security.principal","weblogic");
		parm.setProperty("java.naming.security.credentials","weblogic");
		InitialContext ctx=new InitialContext(parm);
		Adder stub=(Adder)ctx.lookup("myAdder#mypack.Adder");
		int c=stub.add(10,10);
		System.out.println(c);
		
	}
}