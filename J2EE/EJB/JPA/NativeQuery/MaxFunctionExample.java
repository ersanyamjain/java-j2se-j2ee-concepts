package mypack;
import javax.persistence.*;
import java.util.*;

public class MaxFunctionExample
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createQuery("SELECT MAX(emp.empSalary) FROM Employee emp");
			//Query query=em.createQuery("SELECT MIN(emp.empSalary) FROM Employee emp");
			Number cResults=(Number)query.getSingleResult();
			System.out.println("Minimum Result is: "+cResults);
			entr.commit();
		}
		finally
		{
			em.close();
		}
	}
}