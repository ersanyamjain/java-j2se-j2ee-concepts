import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class MyListener implements ServletContextListener
{
	Connection c;
	public void contextInitialized(ServletContextEvent e)
	{
		try
		{
			ServletContext ctx=e.getServletContext();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			ctx.setAttribute("con",c);
			System.out.println("********* Context Created ********");
		}
		catch(Exception e1)
		{
			
		}
	}
	public void contextDestroyed(ServletContextEvent e)
	{
		try
		{
		c.close();	
		}
		catch(SQLException e1)
		{	}
	}
}