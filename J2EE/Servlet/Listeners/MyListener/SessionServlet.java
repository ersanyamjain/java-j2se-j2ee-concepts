import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SessionServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		HttpSession s=req.getSession();
		String s1=(String)s.getAttribute("name");
		out.println(s1+"  "+s.isNew());
		out.println("</html></body>");
	}
}