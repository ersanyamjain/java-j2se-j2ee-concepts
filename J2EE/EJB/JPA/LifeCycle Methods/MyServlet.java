package mypack;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.*;
import mypack.Customer;

public class MyServlet extends HttpServlet
{
	public MyServlet()
	{}
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		PrintWriter out=res.getWriter();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("DucatJPA");
		EntityManager mgr=factory.createEntityManager();
		EntityTransaction t=mgr.getTransaction();
		t.begin();
		Customer cust=new Customer();
		cust.setID(8);
		cust.setFirstName("Mickey");
		cust.setLastName("Bhatia");
		mgr.persist(cust);
		t.commit();
		mgr.close();
		System.out.printf("Successfully Added");
		factory.close();
	}
}