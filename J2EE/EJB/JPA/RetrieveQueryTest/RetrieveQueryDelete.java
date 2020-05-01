package mypack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.*;
import java.util.*;

public class RetrieveQueryDelete
{
	public static void main(String args[])
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager mgr=factory.createEntityManager();
		EntityTransaction t=mgr.getTransaction();
		t.begin();
		Query query=mgr.createQuery("DELETE FROM Student where e.id=101");
		query.executeUpdate();
		t.commit();
		mgr.close();
		factory.close();
		System.out.printf("Successfully Deleted");
	}
}