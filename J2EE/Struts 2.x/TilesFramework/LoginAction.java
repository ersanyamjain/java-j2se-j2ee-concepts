package my.action;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport
{
	private String loginid;
	private String password;
	
	public String execute() throws Exception
	{
		if(loginid.equals(password))
			return "manager";
		else if(loginid.equals("lalu"))
			return "clerk";
		else
		{
			this.addActionError(getText("app.invalid"));
			return ERROR;
		}
	}
	public void validate()
	{
		if((loginid==null)||(loginid.length()==0))
		{
			this.addFieldError("loginid",getText("app.loginid.blank"));
		}
		if((password==null)||(password.length()==0))
		{
			this.addFieldError("password",getText("app.password.blank"));
		}
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void setLoginId(String loginid)
	{
		this.loginid=loginid;
	}
	public String getLoginId()
	{
		return loginid;
	}
}