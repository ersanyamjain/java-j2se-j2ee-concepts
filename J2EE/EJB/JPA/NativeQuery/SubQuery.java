package mypack;
import javax.persistence.*;
import java.util.*;

public class SubQuery
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createQuery("SELECT emp FROM Employee emp WHERE emp.empSalary=(SELECT emp1.empSalary FROM Employee emp1 WEHRE emp1.empSalary>200)");
			List list=query.getResultList();
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				Employee emp=(Employee)itr.next();
				System.out.println("Emp Name: "+emp.getEmpName());
				System.out.println("Salary: "+emp.getEmpSalary());
				System.out.println();
			}
			entr.commit();
		}
		finally
		{
			em.close();
		}
	}
}