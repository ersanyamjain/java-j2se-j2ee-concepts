package mypack;
import javax.persistence.*;
import mypack.Employee;
import java.util.*;

public class SubQueryAVGExample
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createQuery("SELECT emp FROM Employee emp WHERE emp.empSalary >(SELECT AVG(emp1.empSalary) FROM Employee emp1)");
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