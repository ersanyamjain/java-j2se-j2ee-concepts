import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.text.DateFormat;

public class ImageServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		String filename="baby.jpg";
		ServletOutputStream stream=null;
		BufferedInputStream bif=null;
		stream=res.getOutputStream();
		String s1=getServletContext().getRealPath("/files/baby.jpg");
		//Only works with Exploded Deployment
		File doc=new File(s1);
		res.setContentType("image/jpeg");
		res.addHeader("Content-Disposition","attachment;filename="+filename);
		res.setContentLength((int)doc.length());
		FileInputStream input=new FileInputStream(doc);
		bif=new BufferedInputStream(input);
		int readBytes=0;
		while((readBytes=bif.read())!=-1)
			stream.write(readBytes);
	}
}