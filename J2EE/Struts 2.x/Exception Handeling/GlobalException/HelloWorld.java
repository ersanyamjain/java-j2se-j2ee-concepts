package my;

public class HelloWorld
{
	private String message;
	private String userName;
	public HelloWorld()
	{
		
	}
	public String execute() throws NullPointerException,ArithmeticException
	{
		if(userName.equals("lalu"))
			throw new NullPointerException();
		if(userName.equals("rabari"))
			throw new ArithmeticException();
		setMessage("Hello "+userName);
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
		return userName;
	}
	public void setUserName(String userName)
	{
		this.userName=userName;
	}
}