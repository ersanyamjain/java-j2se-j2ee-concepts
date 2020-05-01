package my;

public class UserAction
{
	private User user;
	public UserAction()
	{
		
	}
	public String execute()
	{
		return "success";
	}
	public User getUser()
	{
		return user;
	}
	public void setUser(User user)
	{
		this.user=user;
	}
	
}