package mypack;
import javax.persistence.*;
import java.util.*;

public class GetSingleResultSetExample
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createQuery("SELECT emp FROM Employee emp where emp.id=:id");
			query.setParameter("id",3);
			Employee e=(Employee)query.getSingleResult();
			System.out.println("Employee Name: "+e.getEmpName());
			entr.commit();
		}
		finally
		{
			em.close();
		}
	}
}