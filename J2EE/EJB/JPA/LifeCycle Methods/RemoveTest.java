 package mypack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.*;

public class RemoveTest
{
	public static void main(String args[])
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager mgr=factory.createEntityManager();
		EntityTransaction t=mgr.getTransaction();
		t.begin();
		System.out.printf("Fetching record having 102");
		Customer std=mgr.find(Customer.class,new Long(102));
		System.out.printf(std.getId());
		System.out.printf(std.getFirstName());
		System.out.printf(std.getLastName());
		mgr.remove(std);
		t.commit();
		mgr.close();
		factory.close();
		System.out.printf("Successfully Persisted");
	}
}