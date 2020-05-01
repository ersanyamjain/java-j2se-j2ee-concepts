package mypack;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GeneratedType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.io.*;

@Entity
@Table(name="student")
public class Student implements Serializable
{
	@Id
	@GeneratedValue(strategy=GeneratedType.SEQUENCE)
	@Column(name="ID")
	private long id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="email")
	private String email;
	public Student(long id,String firstname,String lastname,String email)
	{
		this.id=id;
		this.firstname=firstname;
		this.lastname=lastname;
		this.email=email;
	}
	public Student()
	{} //Must Give
	public long getId()
	{
		return this.id;
	}
	public String getFirstName()
	{
		return this.firstname;
	}
	public String getLastName()
	{
		return this.lastname;
	}
	public String getEmail()
	{
		return this.email;
	}
	public void setId(long id)
	{
		this.id=id;
	}
	public void setFirstName(String firstname)
	{
		this.firstname=firstname;
	}
	public void setLastName(String lastname)
	{
		this.lastname=lastname;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
}