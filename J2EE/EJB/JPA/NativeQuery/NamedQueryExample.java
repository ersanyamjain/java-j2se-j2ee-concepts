package mypack;
import javax.persistence.*;
import java.util.*;

public class NamedQueryExample
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			//Query query=em.createNamedQuery("empGetRecords");
			Query query=em.createNamedQuery("empAllRecords");
			List list=query.getResultList();
			Iterator<Employee> itr=list.iterator();
			while(itr.hasNext())
			{
				Employee emp=itr.next();
				System.out.println("Emp Name: "+emp.getEmpName());
				System.out.println("Salary: "+emp.getEmpSalary());
				System.out.println();
			}
			//Second query
			Query query1=em.createNamedQuery("empDeleteRecords");
			query1.setParameter(1,3);
			int deleteddata=query1.executeUpdate();
			System.out.println(deleteddata+" record is deleted.");
			entr.commit();
		}
		finally
		{
			em.close();
		}
	}
}