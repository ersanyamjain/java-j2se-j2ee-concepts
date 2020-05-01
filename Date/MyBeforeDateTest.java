import java.util.Date;

public class MyBeforeDateTest
{
	public static void main(String args[])
	{
		Date current=new Date();
		long prevDay=System.currentTimeMillis()-1000*60*60*24;
		Date prev=new Date(prevDay);
		System.out.println(current);
		System.out.println(prev);
		if(prev.before(current))
		{
			System.out.println("The date is older than current day");
		}
		else
		{
			System.out.println("The date is of future day");
		}
	}
}