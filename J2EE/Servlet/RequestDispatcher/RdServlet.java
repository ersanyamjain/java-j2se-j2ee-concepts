import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class RdServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("user");
		String pass=req.getParameter("pass");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement s=c.createStatement();
			String s1="Select * from emp101 where name='"+name+"' and pass='"+pass+"'";
			ResultSet rs=s.executeQuery(s1);
			out.println("Before Dispatcher<br>");
			if(rs.next())
			{
				req.setAttribute("name","sam");
				RequestDispatcher rd=req.getRequestDispatcher("wel");
				//rd.include(req,res);
				rd.forward(req,res);
			}
			else
				res.sendRedirect("err");	
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("<br>After RequestDispatcher");
		out.println("</body></html>");
	}
}