import java.util.Date;

public class MyAfterDateTest
{
	public static void main(String args[])
	{
		Date current=new Date();
		long nextDay=System.currentTimeMillis()+1000*60*60*24;
		Date next=new Date(nextDay);
		System.out.println(current);
		System.out.println(next);
		if(next.after(current))
		{
			System.out.println("The date is of future day");
		}
		else
		{
			System.out.println("The date is older than current day");
		}
	}
}