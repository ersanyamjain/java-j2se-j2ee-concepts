import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import weblogic.management.servlet.*;

public class UploadWithRestriction extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String path=getServletContext().getRealPath("file");
		String ext=".txt";
		try
		{
		//MultipartRequest mpr=new MultipartRequest(req,path,500*1024*1024,ext);
		out.println("File Uploaded Successfully");
		}
		catch(Exception e)
		{
			out.println("File can't be uploaded with extension: "+ext+" Exception: "+e);
		}
	}
}