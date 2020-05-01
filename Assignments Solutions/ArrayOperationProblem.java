import java.io.*;

public class ArrayOperationProblem
{
	public static void main(String args[]) throws IOException
	{
		int a[]=new int[100];
		int j,count=0,n;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the length of array: ");
		
		n=Integer.parseInt(br.readLine());
		System.out.println("Enter the Elements of array: ");
		for(int i=0;i<n;i++)
		{
		a[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<n;i++)
		{
			j=a[i];
			while(j!=0)
			{
			if(j%2!=0)
			{
				j--;
				count++;
			}
			else
			{
				j/=2;
				count++;
			}
			}
		}
		System.out.println("Minimum Number of Operations: "+count);
		
	}
}