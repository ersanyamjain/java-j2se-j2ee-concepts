import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class FormServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		ServletOutputStream out=res.getOutputStream();
		res.setContentType("text/html");
		out.println("<html><head><title>Basic Form Processor Output</title></head>");
		out.println("<body>");
		out.println("<h1>Here is Your Data: </h1>");
		String title =req.getParameter("title");
		String name =req.getParameter("name");
		String city =req.getParameter("city");
		String country =req.getParameter("country");
		String tel =req.getParameter("tel");
		String age =req.getParameter("age");
		String[] interests =req.getParameterValues("interests");
		out.println("Your Title is: "+title);
		out.println("<br>Your Name is: "+name);
		out.println("<br>Your City is: "+city);
		out.println("<br>Your Country is: "+country);
		out.println("<br>Your Telephone is: "+tel);
		out.println("<br>Your Interests include: <ul>");
		for(int i=0;i<interests.length;i++)
		{
			out.println("<li>"+interests[i]);
		}
		out.println("</ul>");
		out.println("<br>Your Age is: "+age);
		out.println("</body></html>");
	}
}