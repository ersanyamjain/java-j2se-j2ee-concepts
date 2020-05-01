package my;
import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport
{
	private String userName;
	private String password;
	public Login()
	{	}
	
	public String execute()
	{
		return SUCCESS;	
	}
	public void validate()
	{
		if(getUserName().length()==0)
		{
			addActionMessage("Blank Username is not allowed.");
		}
		else if(!getUserName().equals("Eswar"))
		{
			addFieldError("userName","Invalid User");
		}
		if(getPassword().length()==0)
		{
			addActionError("Password is Wrong.");
		}
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