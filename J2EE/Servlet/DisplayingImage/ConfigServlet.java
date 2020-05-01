import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigServlet extends HttpServlet
{
	ServletConfig cfg;
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		cfg=getServletConfig();
		//Enumeration e=cfg.getInitParameterNames();
		String image=cfg.getInitParameter("image");
		String driver=cfg.getInitParameter("driver");
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body background="+image+">");
		out.println(driver);
		out.println("</body></html>");
	}
}