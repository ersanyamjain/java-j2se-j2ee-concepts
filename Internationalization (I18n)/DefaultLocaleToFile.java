import java.util.*;
import java.*;
import java.io.*;
import java.text.*;

class DefaultLocaleToFile
{
	public static void main(String args[]) throws Exception
	{
		Locale list[]=DateFormat.getAvailableLocales();
		FileWriter fw=new FileWriter("locales.txt");
		PrintWriter pw=new PrintWriter(fw);
		String ss="";
		for(int i=0;i<list.length;i++)
		{
			System.out.println(list[i].toString());
			ss+=list[i].toString()+",";
		}
		pw.write(ss);
		pw.flush();
		
	}
}