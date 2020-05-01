import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DemoServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s=req.getSession(false);
		out.println("<html><body>");
		if(s!=null)
		{
		String s1=(String)s.getAttribute("name");
		String s2=(String)s.getAttribute("pass");
		out.println(s1+" = "+s2+" "+s.isNew());
		out.println("<br>");
		out.println("<a href='log'>Logout</a>");
		}
		else
		{
			out.println("Please Login First");
			out.println("<br><br>");
			out.println("<a href='login.html'>Login</a>");
		}
		out.println("</body></html>");
	}
}