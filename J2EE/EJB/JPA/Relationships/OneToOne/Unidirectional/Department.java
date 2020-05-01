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
	public String toString()
	{
		return "Department id:"+getId()+",name: "+getName();
	}
}