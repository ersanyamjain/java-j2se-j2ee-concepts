package mypack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.*;
import java.util.*;

public class OneToOneRetrieve
{
	public static void main(String args[]) throws Exception
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=factory.createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		Query query=em.createQuery("select e from Student1 e");
		List<Student1> list=(List<Student1>)query.getResultList();
		Iterator i=list.iterator();
		while(i.hasNext())
			{
				Student1 std=(Student1)i.next();
				System.out.println(std.getId());
				System.out.println(std.getName());
				System.out.println(std.getDepartment().getId());
				System.out.println(std.getDepartment().getName());
			}
		
		t.commit();
		em.close();
		factory.close();
		System.out.printf("Successfully Retrieved");
	}
}