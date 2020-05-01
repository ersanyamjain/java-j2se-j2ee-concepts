import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ListenerServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		ServletContext ctx=getServletContext();
		Connection c=(Connection)ctx.getAttribute("con");
		try
		{
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("Select * from emp101");
			while(rs.next())
			{
				out.println("Id: "+rs.getString(1));
				out.println("Name: "+rs.getString(2));
				out.println("<br>");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		out.println("</html></body>");
	}
}