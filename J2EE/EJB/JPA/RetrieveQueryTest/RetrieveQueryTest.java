package mypack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.*;
import java.util.*;

public class RetrieveQueryTest
{
	public static void main(String args[])
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager mgr=factory.createEntityManager();
		EntityTransaction t=mgr.getTransaction();
		t.begin();
		Query query=mgr.createQuery("SELECT e from Student e");
		//Query query=mgr.createQuery("SELECT e from Student e where e.id=103");
		List<Student> list=(List<Student>)query.getResultList();
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			Student std=(Student)i.next();
			System.out.print(std.getId());
			System.out.print(std.getFirstName());
		}
		t.commit();
		mgr.close();
		factory.close();
		System.out.printf("Successfully Retrieved");
	}
}