package my;
import com.opensymphony.xwork2.ActionSupport;

public class AddClientAction extends ActionSupport
{
	private String name;
	private String nation;
	private int age;
	public AddClientAction()
	{	}
	
	public String execute() throws Exception
	{
		//Logic for adding new client
		return SUCCESS;	
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setNation(String nation)
	{
		this.nation=nation;
	}
	public String getNation()
	{
		return nation;
	}
		public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
}