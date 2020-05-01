package mypack;
import javax.persistence.*;
import java.math.*;
import java.util.*;

public class NativeQuery1
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createNativeQuery("SELECT empSalary FROM Employee order by empSalary desc");
			List list=query.getResultList();
			Iterator<BigDecimal> itr=list.iterator();
			while(itr.hasNext())
			{
				BigDecimal emp=(BigDecimal)itr.next();
				System.out.println("Salary: "+emp);
				System.out.println();
			}
			
		}
		finally
		{
			em.close();
		}
	}
}