import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DemoServlet1 extends GenericServlet
{
	PrintWriter out;
	static int count=0;
	
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		out=res.getWriter();
		destroy();
		out.println("<html><body>");
		out.println("<br>Hello Servlet From GenericServlet! ");
		out.println("</body></html>");
		
	}
	public void destroy()
		{
			out.println("destroy");
			count++;
			
		}
	
}