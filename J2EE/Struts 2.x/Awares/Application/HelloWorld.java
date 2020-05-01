package my;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.*;
import org.apache.struts2.interceptor.ApplicationAware;

public class HelloWorld implements ApplicationAware
{
	private Map application;
	private String message;
	private String username;
	public HelloWorld()
	{
		
	}
	public void setApplication(Map application)
	{
		this.application=application;
	}
	public String execute()
	{
		setMessage("Hello "+getUserName());
		application.put("name","application");
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