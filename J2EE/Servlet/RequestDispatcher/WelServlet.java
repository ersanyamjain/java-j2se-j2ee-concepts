import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class WelServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String s=(String)req.getAttribute("name");
		out.println("<html><body>");
		out.println("<br><h2>Welcome to MyWeb of DUCAT, "+s+"</h2>");
		out.println("</body></html>");
	}
}