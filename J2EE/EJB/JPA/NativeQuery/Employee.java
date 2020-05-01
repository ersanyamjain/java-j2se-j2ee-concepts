package mypack;
import javax.persistence.*;

@Entity
@Table(name="Employee")
@javax.persistence.NamedQuery(name="empAllRecords",query="Select emp from Employee emp")
@NamedQueries({
	@NamedQuery(name="empGetRecords",query="Select emp from Employee emp"),
	@NamedQuery(name="empDeleteRecords",query="Delete from Employee emp where emp.id=?1")
})

public class Employee
{
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="empName")
	private String empName;
	@Column(name="empSalary")
	private int empSalary;
	
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
	public String getEmpName()
	{
		return this.empName;
	}
	public void setEmpSalary(int empSalary)
	{
		this.empSalary=empSalary;
	}
	public int getEmpSalary()
	{
		return this.empSalary;
	}
	
}