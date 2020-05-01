import java.sql.*;
import java.util.*;

class Oracle2
{
	public static void main(String args[])
	{
		try
		{
			Driver d=new oracle.jdbc.driver.OracleDriver();
			Properties dbprop=new Properties();
			dbprop.put("user","system");
			dbprop.put("password","root");
			Connection c=d.connect("jdbc:oracle:thin:@localhost:8080:apex",dbprop);
			Statement s=c.createStatement();
			s.executeUpdate("create table department(dp_id number PRIMARY KEY,name varchar(20))");
			System.out.println("Table Created");
			s.close();
		}
		catch(SQLException e)
		{
			System.out.println(e);
		}
		catch(Exception i)
		{
			System.out.println(i);
		}
	}
}