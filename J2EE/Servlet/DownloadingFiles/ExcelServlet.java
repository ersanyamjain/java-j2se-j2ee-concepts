import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ExcelServlet extends HttpServlet
{
	PrintWriter out;
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("application/vnd.MS-excel");
		out=res.getWriter();
		out.println("Names\tHindi\tEng\tMaths\tTotal");
		out.println("Bhalu\t35\t20\t95\t=sum(b2,c2,d2)");
	}
}