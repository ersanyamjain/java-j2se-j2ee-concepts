package my;
public class HelloWorld1
{
	private String message;
	private String username;
	public HelloWorld1()
	{
		
	}
	public String execute()
	{
		setMessage("Hello from user pkg "+getUserName());
		return "SUCCESS";
	}
	/* public String show()
	{
		setMessage("Hello from user pkg with show "+getUserName());
		return "SUCCESS";
	} */
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