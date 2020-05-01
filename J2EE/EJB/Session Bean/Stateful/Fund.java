package myejb;
import javax.ejb.*;
@Remote
public interface Fund
{
	public void deposite(double a);
	public void withdraw(double a);
	public double getAmount();
}