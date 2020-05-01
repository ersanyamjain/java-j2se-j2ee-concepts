import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class SendRedirect extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println("before");
		String name=req.getParameter("user");
		String pass=req.getParameter("pass");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			Statement s=c.createStatement();
			String s1="Select * from emp101 where name='"+name+"' and pass='"+pass+"'";
			ResultSet rs=s.executeQuery(s1);
			if(rs.next())
				//res.sendRedirect("http://localhost:9090/tom/wel");
				res.sendRedirect("http://www.google.com");
			else
				res.sendRedirect("err");	
		}
		catch(Exception e)
		{
			out.println(e);
		}
		out.println("after");
		out.println("</body></html>");
		
	}
}