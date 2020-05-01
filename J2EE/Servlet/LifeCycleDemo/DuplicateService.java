import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class DuplicateService extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		super.service(req,res);
		//Will generate an error
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if(name.equals("ADMIN") && pass.equals("ADMIN"))
			out.println("User is valid through service()");
		else
			out.println("User is invalid through service()");
		out.println("</body></html>");
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if(name.equals("ADMIN") && pass.equals("ADMIN"))
			out.println("User is valid through doGet()");
		else
			out.println("User is invalid through doGet()");
		out.println("</body></html>");
	}
}