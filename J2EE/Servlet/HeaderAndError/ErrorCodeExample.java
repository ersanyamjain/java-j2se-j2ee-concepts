import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class ErrorCodeExample extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
	{
		res.sendError(202);
		
	}
}