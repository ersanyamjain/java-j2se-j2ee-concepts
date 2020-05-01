import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class MySessionListener implements HttpSessionListener
{
	public void sessionCreated(HttpSessionEvent e)
	{
		try
		{
			HttpSession s=e.getSession();
			s.setAttribute("name","Sam");
			System.out.println("Session Created");
		}
		catch(Exception e1)
		{
			
		}
	}
	public void sessionDestroyed(HttpSessionEvent e)
	{
		
	}
}