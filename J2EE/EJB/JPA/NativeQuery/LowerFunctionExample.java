package mypack;
import javax.persistence.*;
import java.util.*;

public class LowerFunctionExample
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
			//Query iquery=em.createQuery("UPDATE Employee emp SET emp.empName=LOWER(emp.empName)");
			Query iquery=em.createQuery("UPDATE Employee emp SET emp.empName=UPPER(emp.empName)");
			int updatedrecords=iquery.executeUpdate();
			System.out.println(updatedrecords+" record(s) are updated! ");
			entr.commit();
		}
		finally
		{
			em.close();
		}
	}
}