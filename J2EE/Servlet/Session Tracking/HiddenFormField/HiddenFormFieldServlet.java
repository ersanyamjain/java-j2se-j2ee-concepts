import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class HiddenFormFieldServlet extends HttpServlet
{
		
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
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
		String s1="Select * from emp101 where name='"+name+"' and pass='"+pass+"'";
		ResultSet rs=s.executeQuery(s1);
		if(rs.next())
		{
			HttpSession se=req.getSession();
			String id=se.getId();
			se.setAttribute("name",name);
			se.setAttribute("pass",pass);
			out.println("User is valid "+" "+se.isNew());
			out.println("<br><br>SessionId: "+id);
			out.println("<br><br>");
			out.println("<form action='demo' method='get'>");
			out.println("<input type="+"hidden"+" "+"name="+"jsessionid"+" "+"value="+id+">");
			out.println("<input type='input' name='uname'>");
			out.println("<input type='submit'");
			out.println("</form>");
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