import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import weblogic.management.servlet.*;

public class FileUploadServlet extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String path=getServletContext().getRealPath("file");
		MultipartRequest mpr=new MultipartRequest(req,path,500*1024*1024);
		out.println("<html><body>");
		out.println("File Uploaded Successfully");
		out.println("</body></html>");
	}
}