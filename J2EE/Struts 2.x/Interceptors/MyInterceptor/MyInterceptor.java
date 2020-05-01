package my;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.*;
import org.apache.struts2.*;

public class MyInterceptor extends AbstractInterceptor
{
	public String intercept(ActionInvocation in) throws Exception
	{
		ActionContext atx=in.getInvocationContext();
		HttpServletRequest s=(HttpServletRequest)atx.get(ServletActionContext.HTTP_REQUEST);
		System.out.println("MYINTERCEPTOR");
		String name=s.getParameter("userName");
		String pass=s.getParameter("password");
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		Statement st=c.createStatement();
		String s1="select * from emp101 where name='"+name+"' and pass='"+pass+"'";
		//out.println(s1);
		ResultSet rs=st.executeQuery(s1);
		if(rs.next())
		{
			s.setAttribute("name","ducat");
			return in.invoke();
		}
		else
			return "fail";
	}
	
}