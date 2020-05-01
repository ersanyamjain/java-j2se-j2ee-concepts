import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
//import java.reflect.*;

public class UrlSessionServlet extends HttpServlet
{
		
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		out.println(res.getClass().getName());
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement s=c.createStatement();
		String s1="Select * from emp101 where name='"+name+"' and pass='"+pass+"'";
		ResultSet rs=s.executeQuery(s1);
		if(rs.next())
		{
			HttpSession se=req.getSession();
			se.setAttribute("name",name);
			se.setAttribute("pass",pass);
			out.println("User is valid "+" "+se.isNew());
			String url=res.encodeURL("demo");
			String url1=res.encodeURL("log");
			out.println("<br>"+url);
			out.println("<br>");
			out.println("<a href="+url+">Demo</a>");
			out.println("<br>");
			out.println("<a href="+url1+">Logout</a>");
		}
		else
			out.println("User is Invalid");
		
		}
		catch(Exception e)
		{
		out.println(e);	
		}
		out.println("</body></html>");
	}
}