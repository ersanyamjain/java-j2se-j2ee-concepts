package mypack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class StudentTest
{
	public static void main(String args[])
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager mgr=factory.createEntityManager();
		EntityTransaction t=mgr.getTransaction();
		t.begin();
		Student std1=new Student(101,"Lalu","Yadav","lalu@gmail.com");
		Student std1=new Student(102,"Rabri","Yadav","rabri@gmail.com");
		System.out.printf("Persistence entities..");
		mgr.persist(std1);
		mgr.persist(std2);
		t.commit();
		mgr.close();
		factory.close();
		System.out.printf("Successfully Persisted");
	}
}