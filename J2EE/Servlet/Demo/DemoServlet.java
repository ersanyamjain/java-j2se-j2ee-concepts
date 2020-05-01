import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DemoServlet implements Servlet
{
	public void init(ServletConfig con)
	{
		
	}
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("Hello Servlet From DemoServlet! ");
		out.println("</body></html>");
		
	}
	public void destroy()
		{
			
		}
	public ServletConfig getServletConfig()
	{
		return null;
	}
	public String getServletInfo()
	{
		return null;
	}
}