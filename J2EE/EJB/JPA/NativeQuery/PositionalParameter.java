package mypack;
import javax.persistence.*;
import java.util.*;

public class PositionalParameter
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createQuery("SELECT emp FROM Employee emp WHERE emp.empSalary=?1 OR emp.empName=?2");
			query.setParameter(1,201);
			query.setParameter(2,"NITISH RAI");
			
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