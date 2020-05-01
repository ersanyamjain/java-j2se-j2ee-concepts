import java.io.*;

public class MultiThreadedReadWrite
{
	public static void main(String args[]) throws IOException
	{
		int procs,n,count=0,beep=0;
		char trace[]=new char[50];
		String str;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Number of Processes");
		procs=Integer.parseInt(br.readLine());
		if(procs<1 || procs>10)
			System.out.println("Invalid Number of Processes");
		else
		{
			System.out.println("Enter Number of Traces");
			n=Integer.parseInt(br.readLine());
			if(n>=1 && n<=50)
			{
			System.out.println("Enter the Traces");
			str=br.readLine();
			trace=str.toCharArray();
			for(int i=0;i<n;i++)
			{
				if(trace[i]=='W')
				{
				count++;
				beep=0;
				}
				else if(trace[i]=='R')
				{
					beep++;
					if(beep==1 || beep>procs)
					{
						count++;
						if(beep>procs)
						beep=beep%procs;
					}
				}
				
			}
			System.out.println("The Clock Cycles will be: "+count);
			}
			else
			{
				System.out.println("Invalid Number of Traces");
			}
		}
	}
}