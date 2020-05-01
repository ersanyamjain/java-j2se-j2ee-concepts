package my;
public class HelloWorld2
{
	private String message;
	private String username;
	public HelloWorld2()
	{
		
	}
	public String execute()
	{
		setMessage("Hello from my1 pkg "+getUserName());
		return "SUCCESS";
	}
	/* public String show()
	{
		setMessage("Hello from my1 pkg with show "+getUserName());
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