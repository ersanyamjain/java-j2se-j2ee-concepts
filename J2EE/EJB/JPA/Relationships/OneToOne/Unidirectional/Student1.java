package mypack;
import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import java.io.*;

@Entity
@Table(name="student1")
public class Student1 implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="st_id")
	private long id;
	@Column(name="name")
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="dp_id")
	private Department department;
	
	public long getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public void setId(long id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public Department getDepartment()
	{
		return department;
	}
	public void setDepartment(Department department)
	{
		this.department=department;
	}
}