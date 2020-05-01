package mypack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.*;

public class RetrieveTest
{
	public static void main(String args[])
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager mgr=factory.createEntityManager();
		EntityTransaction t=mgr.getTransaction();
		t.begin();
		System.out.printf("Fetching record having 102");
		Student std=mgr.find(Student.class,new Long(102));
		System.out.printf(std.getId());
		System.out.printf(std.getFirstName());
		t.commit();
		mgr.close();
		factory.close();
		System.out.printf("Successfully Retrieved");
	}
}