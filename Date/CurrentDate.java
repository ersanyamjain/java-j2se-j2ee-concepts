import java.util.*;

public class CurrentDate
{
	public static void main(String args[])
	{
		//Date today=new Date();
		Date today=new Date("05/12/2014 18:30:45");
		//Date today=new Date(5,12,2014,18,30,45); //Wrong
		GregorianCalendar cal=new GregorianCalendar();
		cal.setTime(today);
		System.out.println("Today: "+today.toString());
		displayDateInfo(cal);
		cal.clear();
	}
	static void displayDateInfo(GregorianCalendar cal)
	{
		String days[]={"","SUN","MON","TUE","WED","THU","FRI","SAT"};
		String months[]={"JANUARY","FEBRUARY","MARCH","APRIL","MAY","JUNE","JULY","AUGUST","SEPTEMBER","OCTOBER","NOVEMBER","DECEMBER"};
		String am_pm[]={"AM","PM"};
		System.out.println("Year: "+cal.get(Calendar.YEAR));
		System.out.println("Month: "+months[cal.get(Calendar.MONTH)]);
		System.out.println("Date: "+cal.get(Calendar.DATE));
		System.out.println("Day: "+days[cal.get(Calendar.DAY_OF_WEEK)]);
		System.out.println("Hour: "+cal.get(Calendar.HOUR));
		System.out.println("Minute: "+cal.get(Calendar.MINUTE));
		System.out.println("Second: "+cal.get(Calendar.SECOND));
		System.out.println("AM/PM: "+am_pm[cal.get(Calendar.AM_PM)]);
		TimeZone tz=cal.getTimeZone();
		System.out.println("TimeZone: "+tz.getID());
	}
}
	