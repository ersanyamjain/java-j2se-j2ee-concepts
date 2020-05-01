import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DemoServlet1 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession s=req.getSession();
		String s1=(String)s.getAttribute("name");
		String s2=(String)s.getAttribute("pass");
		out.println("<html><body>");
		out.println(s1+" = "+s2+" "+s.isNew());
		out.println("<br>");
		out.println("<a href='log'>Logout</a>");
		out.println("</body></html>");
	}
}