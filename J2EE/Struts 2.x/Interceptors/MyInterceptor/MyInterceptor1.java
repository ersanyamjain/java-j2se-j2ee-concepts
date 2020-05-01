package my;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import com.opensymphony.xwork2.*;
import com.opensymphony.xwork2.interceptor.*;
import org.apache.struts2.*;

public class MyInterceptor1 implements Interceptor
{
	@Override
	public void destroy()
	{	}
	@Override
	public void init()
	{	}
	@Override
	public String intercept(ActionInvocation in) throws Exception
	{
		System.out.println("INSIDE MYINTERCEPTOR1");
		ActionContext atx=in.getInvocationContext();
		HttpServletRequest s=(HttpServletRequest)atx.get(ServletActionContext.HTTP_REQUEST);
		String name=(String)s.getAttribute("name");
		
		if(name.equals("ducat"))
			return in.invoke();
		else
			return "fail";
	}
	
}