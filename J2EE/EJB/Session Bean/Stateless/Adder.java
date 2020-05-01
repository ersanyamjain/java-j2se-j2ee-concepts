package mypack;
import javax.ejb.Remote;
@Remote
public interface Adder
{
	public int add(int x,int y);
}