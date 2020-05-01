package my;

public class HelloWorld
{
	private String message;
	private String username;
	public HelloWorld()
	{
		
	}
	public String execute() throws NullPointerException,ArithmeticException
	{
		if(username.equals("lalu"))
			throw new NullPointerException();
		if(username.equals("rabari"))
			throw new ArithmeticException();
		setMessage("Hello "+username);
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