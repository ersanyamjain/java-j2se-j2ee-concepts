import javax.naming.*;
import javax.sql.*;
import java.sql.*;
import java.util.*;

class Temp
{
	public static void main(String args[])
	{
		try
		{
		Properties parm=new Properties();
		parm.setProperty("java.naming.factory.initial","weblogic.jndi.WLInitialContextFactory");
		parm.setProperty("java.naming.factory.url","t3://localhost:7001");
		parm.setProperty("java.naming.security.principal","weblogic");
		parm.setProperty("java.naming.security.credentials","weblogic");
		InitialContext ctx=new InitialContext(parm);
		DataSource ds=(DataSource)ctx.lookup("tindi");
		Connection con=ds.getConnection();
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from emp101");
		while(rs.next())
		{
			System.out.println("Id: "+rs.getString(1));
			System.out.println("Name: "+rs.getString(2));
		}
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
	}
}