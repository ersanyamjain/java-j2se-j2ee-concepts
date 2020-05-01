import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class ActualService extends HttpServlet
{
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		super.service(req,res);
		//Will generate an error
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("Actual service()");
	}
}