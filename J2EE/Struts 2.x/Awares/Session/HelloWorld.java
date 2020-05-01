package my;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.SessionAware;

public class HelloWorld implements SessionAware
{
	private Map session;
	private String message;
	private String username;
	public HelloWorld()
	{
		
	}
	public void setSession(Map session)
	{
		this.session=session;
	}
	public String execute()
	{
		setMessage("Hello "+getUserName());
		session.put("name","india");
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