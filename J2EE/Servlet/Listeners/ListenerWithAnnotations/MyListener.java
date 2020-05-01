import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.WebListener;
@WebListener
public class MyListener implements ServletContextListener
{
	Connection c;
	public void contextInitialized(ServletContextEvent e)
	{
		try
		{
			ServletContext ctx=e.getServletContext();
			ctx.setAttribute("name","Sam");
			System.out.println("********* Context Created ********");
		}
		catch(Exception e1)
		{
			
		}
	}
	public void contextDestroyed(ServletContextEvent e)
	{
		
	}
}