package my;
import javax.servlet.*;
import java.util.Map;
import javax.servlet.http.*;
import org.apache.struts2.*;
import com.opensymphony.xwork2.*;
import org.apache.struts2.interceptor.ApplicationAware;

public class HelloWorld
{
	private String message;
	private String username;
	public HelloWorld()
	{
		
	}
	public String execute()
	{
		setMessage("Hello "+username);
		ActionContext atx=ActionContext.getContext();
		HttpServletRequest req=(HttpServletRequest)atx.get(ServletActionContext.HTTP_REQUEST);
		Map s1=(Map)atx.get(ServletActionContext.SESSION);
		//HttpServletResponse res=(HttpServletResponse)atx.get(ServletActionContext.HTTP_RESPONSE);
		ServletContext ctx=(ServletContext)atx.get(ServletActionContext.SERVLET_CONTEXT);
		req.setAttribute("name","Sam ");
		s1.put("name","sessionText");
		ctx.setAttribute("name2","contextText");
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