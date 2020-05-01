import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class RequestServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String s=req.getMethod();
		out.println(s+" via service() method");
		if(s.equals("POST"))
			doPost(req,res);
		if(s.equals("GET"))
			doGet(req,res);
	}
	
	/* public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if(name.equals("ADMIN") && pass.equals("ADMIN"))
			out.println("User is valid through service()");
		else
			out.println("User is invalid through service()");
		out.println("</body></html>");
	} */
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement s=c.createStatement();
		int x=s.executeUpdate("INSERT INTO emp101 values('"+name+"','"+pass+"')");
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
			
		}
		if(name.equals("ADMIN") && pass.equals("ADMIN"))
			out.println("User is valid through doPost()");
		else
			out.println("User is invalid through doPost()");
		out.println("</body></html>");
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html><body>");
		String name=req.getParameter("name");
		String pass=req.getParameter("pass");
		if(name.equals("ADMIN") && pass.equals("ADMIN"))
			out.println("User is valid through doGet()");
		else
			out.println("User is invalid through doGet()");
		out.println("</body></html>");
	}
}