package mypack;
import javax.persistence.*;
import java.util.*;

public class GroupFunctionExample
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			//Query query=em.createQuery("SELECT emp FROM Employee emp group by emp.empSalary");
			//Query query=em.createQuery("SELECT emp FROM Employee emp order by emp.empSalary desc");
			Query query=em.createQuery("SELECT emp FROM Employee emp order by emp.empSalary asc");
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