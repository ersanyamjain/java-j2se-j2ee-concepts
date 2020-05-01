import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
class MyEditor implements ActionListener
{
JFrame jf;
JLabel jl;
JTextField jtf;
JTextArea jta,jta1;
JButton jbcompile,jbrun;
JScrollPane jsp,jsp1;
Runtime r;
String str="";
String fname="";
String result="";
MyEditor()
	{
jf=new JFrame("SAM Java Editor");
jf.setLayout(null);
jl=new JLabel("Enter java Class Name");
jl.setBounds(20,20,130,25);
jtf=new JTextField();
jtf.setBounds(180,20,230,25);
jtf.setFont(new Font("Varinda",Font.PLAIN,17));
jta=new JTextArea(50,50);
jta.addFocusListener(new MyFocusListener(this));
jta1=new JTextArea(50,50);
jta.setFont(new Font("Varinda",Font.PLAIN,17));
jta1.setFont(new Font("Varinda",Font.BOLD,15));
jsp=new JScrollPane(jta);
jsp1=new JScrollPane(jta1);
jsp.setBounds(50,60,640,350);
jsp1.setBounds(50,500,640,250);
jf.add(jsp);
jf.add(jsp1);
jbcompile=new JButton("Compile");
jbrun=new JButton("Run");
jbcompile.setBounds(200,430,80,45);
jbrun.setBounds(380,430,80,45);
jf.add(jl);
jf.add(jtf);
r=Runtime.getRuntime();
jf.add(jbcompile);
jf.add(jbrun);
jbcompile.addActionListener(this);
jbrun.addActionListener(this);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setSize(850,850);
jf.setVisible(true);
	}
public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==jbcompile)
	{
		str="";
		if(!jtf.getText().equals(""))
		{
			try
			{ 
			result="";
				fname=jtf.getText().trim()+".java";
				FileWriter fw=new FileWriter(fname);
				String s1=jta.getText();
				PrintWriter pw=new PrintWriter(fw);
				pw.println(s1);
				pw.flush();
				Process error=r.exec("C:\\Program Files\\Java\\jdk1.8.0_45\\bin\\javac.exe -d . "+fname);
				BufferedReader err=new BufferedReader(new InputStreamReader(error.getErrorStream()));
				while(true)
				{
					String temp=err.readLine();
					if(temp!=null)
					{
						result+=temp;
						result+="\n";
						
					}
					else 
						break;
				}
				
				if(result.trim().equals(""))
				{
					jta1.setText("Compilation Successful! "+fname);
					err.close();
				}
				else
					jta1.setText(result);
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		else
			jta1.setText("Please Enter the Java programe name!");
		
	}
	else if(e.getSource()==jbrun)
	{
		int start=0;
		try{
			String fn=jtf.getText().trim();
			Process p=r.exec("C:\\Program Files\\Java\\jdk1.8.0_45\\bin\\java "+fn);
			BufferedReader output=new BufferedReader(new InputStreamReader(p.getInputStream()));
			BufferedReader error=new BufferedReader(new InputStreamReader(p.getErrorStream()));
			while(true)
			{
				String temp=output.readLine();
				if(temp!=null)
				{
					result+=temp;
					result+="\n";
					
				}
				else{
					break;
				}
			}
			if(result.trim().equals(""))
			{
				while(true)
				{
					String temp=error.readLine();
					if(temp!=null)
					{
						result+=temp;
						result+="\n";
						
					}
					else
					{
						break;
					}
				}
			}
			output.close();
			error.close();
			jta1.setText(result);
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
	}
}

public static void main(String args[])
{
	new MyEditor();
	
}

class MyFocusListener extends FocusAdapter
{
	MyEditor e;
	MyFocusListener(MyEditor e)
	{
		this.e=e;
	}
	public void focusGained(FocusEvent fe)
	{
		/* if(jta.getText().trim().equals(""))
		{
			
		String str=jtf.getText().trim();
		e.jta.setText("public class "+str+"\n"+"{"+"\n"+"public static void main(String args[])"+"\n"+"{"+"\n"+"   "+"\n"+"}"+"\n"+"}");
		}
		 else */
		{
			
		 try
		 {
		
		fname=jtf.getText().trim()+".java";
				
				String s1=new String();
			
		FileReader fr=new FileReader(fname);
  int i;
  while((i=fr.read())!=-1)
  {
	  s1+=(char)i;
	//s1+="\n";
  }
  if(s1.equals(""))
	{
		e.jta.setText("public class "+str+"\n"+"{"+"\n"+"public static void main(String args[])"+"\n"+"{"+"\n"+"   "+"\n"+"}"+"\n"+"}");
		fr.close();
	}
	else
		jta.setText(s1);
	
}
		 catch(FileNotFoundException e3)
		 {
			 str=jtf.getText().trim();
			 e.jta.setText("public class "+str+"\n"+"{"+"\n"+"public static void main(String args[])"+"\n"+"{"+"\n"+"   "+"\n"+"}"+"\n"+"}");
			
		 }
		 catch(IOException e4)
		 {
			System.out.println(e4); 
		 }
  }
	}
}
}

