package my;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Date;

public class AddEmployeeAction extends ActionSupport
{
	private String empid;
	private String password;
	private String password1;
	private String empname;
	private String city;
	private String email;
	private Date doj;
	private Integer age;
	
	public AddEmployeeAction()
	{	}
	
	public String execute() throws Exception
	{
		//Logic for adding new employee
		return SUCCESS;	
	}
	
	public void setEmpID(String empid)
	{
		this.empid=empid;
	}
	public String getEmpID()
	{
		return empid;
	}
	
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
		public void setPassword1(String password1)
	{
		this.password1=password1;
	}
	public String getPassword1()
	{
		return password1;
	}
	public void setEmpName(String empname)
	{
		this.empname=empname;
	}
	public String getEmpName()
	{
		return empname;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public Date getDOJ()
	{
		return doj;
	}
	public void setDOJ(Date doj)
	{
		this.doj=doj;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setAge(Integer age)
	{
		this.age=age;
	}
	
}