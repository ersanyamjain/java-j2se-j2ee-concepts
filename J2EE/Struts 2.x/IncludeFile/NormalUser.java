package my;

public class NormalUser
{
	private String message;
	
	public String execute()
	{
		setMessage("Hello user. :)");
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