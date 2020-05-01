import java.io.PrintStream;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyListener
    implements HttpSessionListener, ServletContextListener
{

    public MyListener()
    {
    }

    public void sessionCreated(HttpSessionEvent httpsessionevent)
    {
        HttpSession httpsession = httpsessionevent.getSession();
    }

    public void sessionDestroyed(HttpSessionEvent httpsessionevent)
    {
        System.out.println("SEssion destroying...");
        HttpSession httpsession = httpsessionevent.getSession();
        ServletContext servletcontext = httpsession.getServletContext();
        String s = (String)httpsession.getAttribute("userId");
        String s1 = (String)httpsession.getAttribute("pass");
        System.out.println((new StringBuilder()).append(s).append("  : ").append(s1).toString());
        try
        {
            Connection connection = (Connection)servletcontext.getAttribute("con");
            Statement statement = connection.createStatement();
            statement.executeUpdate((new StringBuilder()).append("update cust set loginStatus='F' where userId = '").append(s).append("' and pass = '").append(s1).append("'").toString());
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    public void contextInitialized(ServletContextEvent servletcontextevent)
    {
        try
        {
            ServletContext servletcontext = servletcontextevent.getServletContext();
            String s = servletcontext.getInitParameter("driver");
            String s1 = servletcontext.getInitParameter("url");
            String s2 = servletcontext.getInitParameter("user");
            String s3 = servletcontext.getInitParameter("pass");
            Class.forName(s);
            Connection connection = DriverManager.getConnection(s1, s2, s3);
            servletcontext.setAttribute("con", connection);
            System.out.println("Context Created");
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    public void contextDestroyed(ServletContextEvent servletcontextevent)
    {
    }
}
