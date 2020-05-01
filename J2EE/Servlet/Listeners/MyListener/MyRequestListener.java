import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class MyRequestListener implements ServletRequestListener
{
	public void requestInitialized(ServletRequestEvent e)
	{
		try
		{
			ServletRequest s=e.getServletRequest();
			s.setAttribute("name","Sam");
			System.out.println("Request Created");
		}
		catch(Exception e1)
		{
			
		}
	}
	public void requestDestroyed(ServletRequestEvent e)
	{
		
	}
}