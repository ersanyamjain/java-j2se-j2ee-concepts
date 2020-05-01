package mypack;
import javax.persistence.*;
import java.util.*;

public class CountFunction
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createQuery("SELECT COUNT(emp.empName) FROM Employee emp");
			Number cResults=(Number)query.getSingleResult();
			System.out.println("Total Count result: "+cResults);
			entr.commit();
		}
		finally
		{
			em.close();
		}
	}
}