package myejb;
import javax.ejb.*;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;
import javax.ejb.Remove;

@Stateful(mappedName="myAccount15")
public class FundBean implements Fund
{
	private double amt;
	public double getAmount()
	{
		return amt;
	}
	public void deposite(double a)
	{
		amt=amt+a;
	}
	public void withdraw(double a)
	{
		if(amt>amt)
		{
			amt=amt-a;
		}
	}
	public FundBean()
	{
		System.out.println("Constructor...");
	}
	@PostConstruct
	public void init()
	{
		System.out.println("init() method");
	}
	/*
	@PostActivate
	public void activate(){}
	*/
	@PreDestroy
	public void shutdown(){}
	
	@PrePassivate
	public void passivate()
	{
		System.out.println("Passivate");
	}
	/*
	@Remove
	public void removeAction()
	{
		System.out.println("remove");
	}
	*/
}