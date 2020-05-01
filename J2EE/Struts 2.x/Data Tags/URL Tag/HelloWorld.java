package my;

public class HelloWorld
{
	private String message;
	private String user;
	
	public HelloWorld()
	{	}
	
	public String execute()
	{
		setMessage("Hello "+getUser());
		return "success";
	}
	public void setUser(String user)
	{
		this.user=user;
	}
	public String getUser()
	{
		return user;
	}
		public void setMessage(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	
}