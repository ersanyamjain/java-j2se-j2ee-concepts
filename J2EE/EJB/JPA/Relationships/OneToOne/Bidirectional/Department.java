package mypack;
import javax.persistence.*;
import javax.persistence.GenerationType;
import java.io.*;

@Entity
@Table(name="department")
public class Department implements Serializable
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="dp_id")
	private long id;
	@Column(name="name")
	private String name;
	@OneToOne(cascade=CascadeType.ALL,mappedBy="Department")
	@JoinColumn(name="st_id")
	private Student1 student1;
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
	public void setStudent1(Student1 student1)
	{
		this.student1=student1;
	}
	public Student1 getStudent1()
	{
		return this.student1;
	}
	public String toString()
	{
		return "Department id:"+getId()+",name: "+getName();
	}
}