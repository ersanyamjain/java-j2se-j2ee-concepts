package mypack;
import javax.persistence.*;

@Entity
public class Customer implements java.io.Serializable
{
	private int id;
	private String lastname,firstname;
	Customer(int id,String lastname,String firstname)
	{
		this.id=id;
		this.lastname=lastname;
		this.firstname=firstname;
	}
	Customer()
	{}
	public void setID(int id)
	{
		this.id=id;
	}
	@Id
	@GeneratedValue
	public int getID()
	{
		return this.id;
	}
	public void setFirstName(String firstname)
	{
		this.firstname=firstname;
	}
	public String getFirstName()
	{
		return this.firstname;
	}
	public void setLastName(String lastname)
	{
		this.lastname=lastname;
	}
	public String getLastName()
	{
		return this.lastname;
	}
	@PostLoad
	public void postLoad()
	{
		System.out.println("@PostLoad");
	}
	
	@PostPersist
	public void postPersist()
	{
		System.out.println("@PostPersist");
	}
	@PostRemove
	public void postRemove()
	{
		System.out.println("@PostRemove");
	}
	@PostUpdate
	public void postUpdate()
	{
		System.out.println("@PostUpdate");
	}
	@PrePersist
	public void prePersist()
	{
		System.out.println("@PrePersist");
	}
	@PreRemove
	public void preRemove()
	{
		System.out.println("@PreRemove");
	}
	@PreUpdate
	public void preUpdate()
	{
		System.out.println("@PreUpdate");
	}
}