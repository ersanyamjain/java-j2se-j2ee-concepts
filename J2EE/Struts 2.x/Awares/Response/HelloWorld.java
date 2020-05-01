package my;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.ServletResponseAware;

public class HelloWorld implements ServletResponseAware
{
	private HttpServletResponse res;
	private String message;
	private String username;
	public HelloWorld()
	{
		
	}
	public void setServletResponse(HttpServletResponse res)
	{
		this.res=res;
	}
	public String execute() throws Exception
	{
		PrintWriter pw=res.getWriter();
		setMessage("Hello "+getUserName());
		pw.println("Welcome ");
		return null;
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message=message;
	}
	public String getUserName()
	{
		return username;
	}
	public void setUserName(String username)
	{
		this.username=username;
	}
}