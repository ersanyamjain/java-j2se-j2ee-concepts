import java.util.Date;

public class DateCreationWithSeconds
{
	public static void main(String args[])
	{
		long currenttimeinsec=System.currentTimeMillis();
		//System.out.println("Years till: "+(currenttimeinsec)/(1000*60*60*24*365));
		Date d=new Date(currenttimeinsec);
		System.out.println(d);
	}
}