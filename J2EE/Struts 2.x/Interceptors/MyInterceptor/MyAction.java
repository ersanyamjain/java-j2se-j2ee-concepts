package my;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.*;
import org.apache.struts2.*;
import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport
{
	private String userName;
	private String password;
	public MyAction()
	{	}
	public String execute()
	{
		ActionContext atx=ActionContext.getContext();
		HttpServletRequest s=(HttpServletRequest)atx.get(ServletActionContext.HTTP_REQUEST);
		String uname=(String)s.getAttribute("name");
		System.out.println(uname);
		if(uname.equals("ducat"))
			return SUCCESS;	
		else
			return "fail";	
	}	
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
	public String getUserName()
	{
		return userName;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	
}