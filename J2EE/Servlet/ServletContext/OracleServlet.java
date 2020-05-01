import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class OracleServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		ServletContext ctx=getServletContext();
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		//Enumeration e=ctx.getInitParameterNames();
		String driver=ctx.getInitParameter("driver");
		String url=ctx.getInitParameter("url");
		String user=ctx.getInitParameter("user");
		String pass1=ctx.getInitParameter("pass");
		try
		{
			Class.forName(driver);
			Connection c=DriverManager.getConnection(url,user,pass1);
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("Select * from emp101");
			while(rs.next())
			{
				out.println(rs.getString(1));
				out.println(rs.getString(2));
				out.println("<br>");
				
			}
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("</body></html>");
	}
}