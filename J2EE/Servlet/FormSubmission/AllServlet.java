import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class AllServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		Enumeration e=req.getParameterNames();
		while(e.hasMoreElements())
		{
		String name=(String)e.nextElement();
		String value=req.getParameter(name);
		out.println(name+" = "+value);
		out.println("<br>");
		}
		
		out.println("</body></html>");
	}
}