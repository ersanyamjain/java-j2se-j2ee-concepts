package mypack;
import javax.persistence.*;

public class AvgFunction
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createQuery("SELECT AVG(emp.empSalary) from Employee emp");
			Number cResult=(Number)query.getSingleResult();
			System.out.println("Total Result Count: "+cResult);
			entr.commit();
		}
		finally
		{
			em.close();
		}
	}
}