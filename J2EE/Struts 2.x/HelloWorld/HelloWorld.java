package my;
public class HelloWorld
{
	private String message;
	private String username;
	public HelloWorld()
	{
		
	}
	public String execute()
	{
		setMessage("Hello from default pkg "+getUserName());
		return "SUCCESS";
	}
	public String show()
	{
		setMessage("Hello from default pkg with show "+getUserName());
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