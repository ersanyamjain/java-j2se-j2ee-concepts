import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Logout extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s=req.getSession();
		s.invalidate();
		out.println("<html><body>");
		out.println("You have been logged out successfully!");
		out.println("<br>");
		out.println("<a href='login.html'>Login</a>");
		out.println("</body></html>");
	}
}