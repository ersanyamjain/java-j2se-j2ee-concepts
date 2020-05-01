package mypack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.*;
import java.util.*;

public class OneToOne
{
	public static void main(String args[]) throws Exception
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=factory.createEntityManager();
		EntityTransaction t=em.getTransaction();
		t.begin();
		Student1 std=new Student1();
		Department d=new Department();
		std.setId(104);
		std.setName("rabari");
		d.setId(9);
		d.setName("kamwali");
		std.setDepartment(d);
		em.persist(std);
		// d will be automatically persisted
		t.commit();
		em.close();
		factory.close();
	}
}