package my;

public class AdminUser
{
	private String message;
	
	public String execute()
	{
		setMessage("Hello admin. :)");
		return "success";
	}
	public String getMessage()
	{
		return message;
	}
	public void setMessage(String message)
	{
		this.message=message;
	}
	
}