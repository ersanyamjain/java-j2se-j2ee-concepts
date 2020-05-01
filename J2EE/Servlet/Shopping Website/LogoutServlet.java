import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class LogoutServlet extends HttpServlet
{

    public LogoutServlet()
    {
    }

    public void service(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws IOException, ServletException
    {
        httpservletresponse.setContentType("text/html");
        PrintWriter printwriter = httpservletresponse.getWriter();
        printwriter.println("<html><body>");
        HttpSession httpsession = httpservletrequest.getSession(false);
        Cookie acookie[] = httpservletrequest.getCookies();
        if(acookie != null)
        {
            for(int i = 0; i < acookie.length; i++)
            {
                acookie[i].setValue("");
                acookie[i].setPath("/");
                acookie[i].setMaxAge(0);
                httpservletresponse.addCookie(acookie[i]);
            }

        }
        if(httpsession != null)
        {
            httpsession.invalidate();
        }
        RequestDispatcher requestdispatcher = httpservletrequest.getRequestDispatcher("/index.html");
        requestdispatcher.forward(httpservletrequest, httpservletresponse);
        printwriter.println("</html></body>");
    }
}
