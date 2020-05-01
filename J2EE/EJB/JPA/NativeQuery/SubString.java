package mypack;
import javax.persistence.*;
import java.util.*;

public class SubString
{
	public static  void main(String args[])
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager em=emf.createEntityManager();
		try
		{
			EntityTransaction entr=em.getTransaction();
			entr.begin();
			Query query=em.createQuery("UPDATE Employee emp SET emp.empName=SUBSTRING(emp.empName,1,6)");
			int updatedrecords=query.executeUpdate();
			System.out.println(updatedrecords+" records are updated! ");
		entr.commit();	
		}
		/* catch(Exception e)
		{
			
		} */
		finally
		{
			em.close();
		}
	}
}