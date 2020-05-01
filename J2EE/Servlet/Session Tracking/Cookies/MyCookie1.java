import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class MyCookie1 extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		Cookie c[]=req.getCookies();
		if(c==null)
		{
			Cookie c1=new Cookie("name","Sam");
			Cookie c2=new Cookie("address","Noida");
			res.addCookie(c1);
			res.addCookie(c2);
			c1.setMaxAge(30*60);
			c2.setMaxAge(30*60);
			out.println("Cookies Added");
		}
		else
		{
			out.println("<form>");
			out.println("<input type='text' value="++">");
			out.println("<br>");
			out.println("<input type='text' value="+c[1].getValue()+">");
			out.println("<br>");
			out.println("<input type='submit'>");
			out.println("</form>");
			out.println("</body></html>");
		}
	}
}