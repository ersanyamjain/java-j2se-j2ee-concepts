import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.jms.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.*;
import java.sql.Connection;
import javax.sql.*;

@WebServlet(name="PoolServlet",urlPatterns={"/pool"})
public class PoolServlet extends HttpServlet
{
	@Resource(mappedName="tindi")
	DataSource ds;
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		try
		{
			Connection c=ds.getConnection();
			Statement s=c.createStatement();
			String s1="select * from emp101";
			ResultSet rs=s.executeQuery(s1);
			while(rs.next())
			{
				out.println("Id: "+rs.getString(1));
				out.println("Name: "+rs.getString(2));
				out.println("<br>");
			}
			out.println("</body></html>");
		}
		catch(Exception e)
		{}
	}
	
}
