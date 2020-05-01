package mypack;
import javax.persistence.*;
import java.util.*;

public class CreateFunctionExample
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createQuery("SELECT emp FROM Employee emp");
			List list=query.getResultList();
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				Employee emp=(Employee)itr.next();
				System.out.println("Emp Name: "+emp.getEmpName());
				System.out.println("Salary: "+emp.getEmpSalary());
				System.out.println();
			}
			query=em.createQuery("UPDATE Employee emp SET emp.empName=CONCAT(emp.empName,'Rai')");
			int updatedrecords=query.executeUpdate();
			System.out.println(updatedrecords+" records are affected");
			entr.commit();
		}
		finally
		{
			em.close();
		}
	}
}