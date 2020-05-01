package my;

public class HelloWorld
{
	Environment environment=new Environment("Development");
	public String execute()
	{
		return "success";
	}
	public void setEnvironment(Environment environment)
	{
		this.environment=environment;
	}
	public Environment getEnvironment()
	{
		return environment;
	}
	
}