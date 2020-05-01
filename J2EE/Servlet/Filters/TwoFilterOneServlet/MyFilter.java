import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyFilter implements Filter
{
	FilterConfig config;
	public void init(FilterConfig config) throws ServletException
	{
		this.config=config;
	}
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