import java.sql.*;
import java.util.*;

class Oracle1
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
			s.executeUpdate("create table student1(st_id number PRIMARY KEY,name varchar(20),dp_id number, FOREIGN KEY(dp_id) REFERENCES department(dp_id))");
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