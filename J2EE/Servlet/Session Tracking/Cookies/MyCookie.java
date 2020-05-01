import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyCookie extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		Cookie c[]=req.getCookies();
		if(c==null)
		{
			Cookie c1=new Cookie("name","Sam");
			Cookie c2=new Cookie("address","Noida");
			res.addCookie(c1);
			res.addCookie(c2);
			out.println("Cookies Added");
		}
		else
		{
			for(int i=0;i<c.length;i++)
			{
				out.println(c[i].getName());
				out.println(c[i].getValue());
				out.println("<br>");
			}
		}
		out.println("</body></html>");
	}
}