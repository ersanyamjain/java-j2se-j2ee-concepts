import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;

@WebServlet(urlPatterns={"/initparam"},initParams={
	@WebInitParam(name="email", value="abc@gmail.com"),
	@WebInitParam(name="phone", value="12345678")
})
public class ServletInitParamDemo extends HttpServlet
{
	private String email="",phone="";
	public ServletInitParamDemo()
	{
		super();
	}
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		email=config.getInitParameter("email");
		email=config.getInitParameter("phone");
	}
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		String html="<h2>Access Data Using @WebInitParam </h2>";
		PrintWriter out=res.getWriter();
		html+="<h3>Email: "+email+"<br/>Phone No. :"+phone+"</h3>";
		out.println(html);
	}
	
}