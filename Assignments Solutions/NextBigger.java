import java.io.*;
import java.util.*;

public class NextBigger
{
	public static void main(String args[]) throws IOException
	{
		int a,a1,n=5,j;
		boolean f=true;
		int s[]=new int[n];
		Integer s1[]=new Integer[n];
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the 5 digits number: ");
		a=Integer.parseInt(br.readLine());
		a1=a;
		for(int i=0;i<n;i++)
		{
		s[i]=a1%10;
		a1=a1/10;
		}
		
		ArrayList<Integer> arrl=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			arrl.add(s[i]);
		}
		Collections.sort(arrl);
		arrl.<Integer>toArray(s1);
		a1=0;
		for(int i=0,k=10000;i<5;i++,k/=10)
		a1=a1+s1[i].intValue()*k;
		System.out.println(a1);
		long a2=a1+1;
		
		while(f)
		{
			
			System.out.println(a2);
			for(int i=0;i<n;i++)
			{
			s[i]=(int)a2%10;
			a2=a2/10;
			}
			ArrayList<Integer> arrl1=new ArrayList<>();
			for(int i=0;i<n;i++)
			{
				arrl1.add(s[i]);
			}
			if(arrl1.containsAll(arrl))
			{
				f=false;
				System.out.println("Next Bigger is: "+a2);
				
			}
			a2++;
		}
	}
}