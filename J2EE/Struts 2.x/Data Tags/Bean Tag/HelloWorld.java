package my;

public class HelloWorld
{
	private String name;
	public String execute()
	{
		setName("Sam");
		return "success";
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
}