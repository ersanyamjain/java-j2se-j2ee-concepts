import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;
public class ApplicationInitializer extends HttpServlet
{
	public void init(javax.servlet.ServletConfig sc) throws ServletException
	{
		ServletContext ctx=sc.getServletContext();
		String val=ctx.getInitParameter("oracletab");
		String valsql=ctx.getInitParameter("sqltable");
		String prop=ctx.getRealPath("WEB-INF//db/db.properties");
		String oracle=ctx.getRealPath("WEB-INF//dbtable/oracletable.sql");
		String sql=ctx.getRealPath("WEB-INF//dbtable/sqltable.sql");
		LoadProperties.propLoad(prop);
		if(val.equals("yes"))
		{
			TableCreate.createTab(oracle);
			System.out.println("Table Successfully Created");
		}
		if(valsql.equals("yes"))
		{
			TableCreate.createTab(sql);
			System.out.println("MySQL Table Successfully Created");
			
		}
		
	}
}