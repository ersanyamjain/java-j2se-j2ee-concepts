import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class RegisterServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body><br><h1>User Already Exists! Try Again</h1>");
		out.println("<br><h2>Registration Page Reloading...</h2></body></html>");
		HttpServletResponse rss=(HttpServletResponse)res;
		rss.setHeader("Refresh","4;register.html");
		/*
		{
			RequestDispatcher rd=req.getRequestDispatcher("/userexist");
			rd.forward(req,res);
		}
		catch(Exception e)
		{
			out.println(e);
		}
		*/
		out.println("</body></html>");
	}
}