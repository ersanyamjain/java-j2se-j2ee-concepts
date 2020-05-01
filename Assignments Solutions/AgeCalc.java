import javax.swing.*;
import java.text.*;
import java.util.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AgeCalc implements ActionListener
{
	String name;
	int day,year,month,age;
	String monthstr;
	GregorianCalendar cal1,cal2;
	JFrame jf;
	JLabel lb1,lb2,lb3,lb4,lb5;
	JTextField tf1,tf2,tf3;
	JButton jb;
	JComboBox jcbDay,jcbMonth,jcbYear;
	JPanel pnl1; 
		
	AgeCalc()
	{
		JFrame jf=new JFrame("Age Calculator");
		jf.setLayout(null);
		jf.setSize(500,600);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		lb1=new JLabel("Enter Your Name: ");
		lb2=new JLabel("Select Your Date of Birth: ");
		lb3=new JLabel("Your Age is: ");
		lb4=new JLabel("Your Next BirthDay is: ");
		lb5=new JLabel();
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		jb=new JButton("Calculate");
		pnl1=new JPanel(); 

				
		 Vector<Integer> vctdays=new Vector<>();
		 Vector<String> vctmonths=new Vector<>();
		 Vector<Integer> vctyears=new Vector<>();
		 
		 for(int i=1;i<32;i++)
			 vctdays.add(i);
		 for(int i=2015;i>1929;i--)
			 vctyears.add(i);
		 vctmonths.add("January"); vctmonths.add("February"); vctmonths.add("March"); vctmonths.add("April"); vctmonths.add("May"); vctmonths.add("June"); vctmonths.add("July"); vctmonths.add("August"); vctmonths.add("September"); vctmonths.add("October"); vctmonths.add("November"); vctmonths.add("December");
		
		jcbDay=new JComboBox(vctdays);
		jcbMonth=new JComboBox(vctmonths);
		jcbYear=new JComboBox(vctyears);

		lb1.setBounds(50,50,200,30);
		tf1.setBounds(50,100,200,30);
		lb2.setBounds(50,150,300,30);
		jcbDay.setBounds(50,200,50,30);
		jcbMonth.setBounds(130,200,100,30);
		jcbYear.setBounds(260,200,70,30);
		lb3.setBounds(50,250,200,30);
		tf2.setBounds(50,300,100,30);
		lb4.setBounds(50,350,300,30);
		tf3.setBounds(50,400,300,30);
		jb.setBounds(50,450,100,30);
		lb5.setBounds(50,500,300,30);

		tf2.setEnabled(false);
		tf3.setEnabled(false);
		jf.add(lb1);
		jf.add(tf1);
		jf.add(lb2);
		jf.add(jcbDay);
		jf.add(jcbMonth);
		jf.add(jcbYear);
		jf.add(lb3);
		jf.add(tf2);
		jf.add(lb4);
		jf.add(tf3);
		jf.add(jb);
		jf.add(lb5);
		
		jb.addActionListener(this);
	}
	public void actionPerformed(ActionEvent event)
	{
		if (!tf1.getText().equals(""))
		{
			name=tf1.getText();
			day=Integer.parseInt(jcbDay.getSelectedItem().toString());
			monthstr=jcbMonth.getSelectedItem().toString();
			year=Integer.parseInt(jcbYear.getSelectedItem().toString());
			switch(monthstr)
			{
				case "January" : month=1; break;
				case "February" : month=2; break;
				case "March" : month=3; break;
				case "April" : month=4; break;
				case "May" : month=5; break;
				case "June" : month=6; break;
				case "July" : month=7; break;
				case "August" : month=8; break;
				case "September" : month=9; break;
				case "October" : month=10; break;
				case "November" : month=11; break;
				case "December" : month=12; break;
				default : month=1;
			}
			
		}
		calcAge();
		calcBday();
		lb5.setText("Thank You "+name+". Have a Great Day! :)");
	}
	public void calcAge()
	{
		//System.out.println(day+" "+month+" "+year);
		Date d1=new Date();
		cal1=new GregorianCalendar();
		cal1.setTime(d1);
		Date dob=new Date(day+"/"+month+"/"+year+" 00:01:00");
		cal2=new GregorianCalendar();
		cal2.setTime(dob);
		//System.out.println(dob);
		age=cal1.get(Calendar.YEAR)-cal2.get(Calendar.YEAR);
		tf2.setText(age+" Years");
		cal1.clear();
		cal2.clear();
	}
	public void calcBday()
	{
		//System.out.println(day+" "+month+" "+year);
		Date d1=new Date();
		cal1=new GregorianCalendar();
		cal1.setTime(d1);
		//System.out.println(day+"/"+month+"/"+year+" 00:01:00");
		Date dob=new Date(day+"/"+month+"/"+year+" 00:01:00");
		cal2=new GregorianCalendar();
		cal2.setTime(dob);
		//System.out.println(dob);
		/* System.out.println(cal1.get(Calendar.MONTH));
		System.out.println(cal2.get(Calendar.MONTH));
		System.out.println(cal1.get(Calendar.DATE));
		System.out.println(cal2.get(Calendar.DATE)); */
		
		int bmon=cal2.get(Calendar.MONTH)-cal1.get(Calendar.MONTH)+12;
		int bdy=cal2.get(Calendar.DATE)-cal1.get(Calendar.DATE)+31;
		tf3.setText(bmon+" Months "+bdy+" Days Later");
		cal1.clear();
		cal2.clear();
	}
	public static void main(String args[])
	{
	AgeCalc ac=new AgeCalc();
	}
}