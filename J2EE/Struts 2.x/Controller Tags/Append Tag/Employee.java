package my;
import java.util.*;

public class Employee
{
	private String name;
	private String department;
	public Employee()
	{	}
	public Employee(String name,String department)
	{
		this.name=name;
		this.department=department;
	}
	private List employees;
	private List contractors;
	public String execute()
	{
		employees = new ArrayList();
		employees.add(new Employee("lalu","Recruitment"));
		employees.add(new Employee("Rabari","Accounts"));
		employees.add(new Employee("Rahul","Recruitment"));
		employees.add(new Employee("Sonia","Accounts"));
		contractors=new ArrayList();
		contractors.add(new Employee("Tania","Database"));
		contractors.add(new Employee("Shruti","Network"));
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
	public void setDepartment(String department)
	{
		this.department=department;
	}
	public String getDepartment()
	{
		return department;
	}
	public List getEmployees()
	{
		return employees;
	}
	public void setEmployees(List employees)
	{
		this.employees=employees;
	}
	public List getContractors()
	{
		return contractors;
	}
	public void setContractors(List contractors)
	{
		this.contractors=contractors;
	}
}