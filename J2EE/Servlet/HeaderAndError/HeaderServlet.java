import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class HeaderServlet extends HttpServlet
{
	PrintWriter out;
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		out=res.getWriter();
		Enumeration e=req.getHeaderNames();
		while(e.hasMoreElements())
		{
			String name=(String)e.nextElement();
			String value=req.getHeader(name);
			out.println(name+" : "+value+"<br>");
		}
		out.println("Protocol: "+req.getProtocol()+"<br>");
		out.println("Method: "+req.getMethod()+"<br>");
		out.println("URI: "+req.getRequestURI());
	}
}