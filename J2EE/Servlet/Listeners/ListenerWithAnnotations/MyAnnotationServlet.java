import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name="MyAnnotationServlet",urlPatterns={"/listener"})
public class MyAnnotationServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		ServletContext ctx=getServletContext();
		String s=(String)ctx.getAttribute("name");
		out.println("<h2>Hello World Servlet Annotation Example</h2>"+s);
		out.println("</html></body>");
	}
}