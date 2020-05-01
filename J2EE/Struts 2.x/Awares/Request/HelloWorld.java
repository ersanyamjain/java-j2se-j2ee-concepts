package my;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.ServletRequestAware;

public class HelloWorld implements ServletRequestAware
{
	private HttpServletRequest req;
	private String message;
	private String username;
	public HelloWorld()
	{
		
	}
	public void setServletRequest(HttpServletRequest req)
	{
		this.req=req;
	}
	public String execute()
	{
		setMessage("Hello "+getUserName());
		String s=req.getParameter("userName");
		req.setAttribute("name",s);
		return "SUCCESS";
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