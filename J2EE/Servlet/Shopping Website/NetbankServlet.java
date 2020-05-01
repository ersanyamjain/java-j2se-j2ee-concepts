import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class NetbankServlet extends HttpServlet
{

    public NetbankServlet()
    {
    }

    public void service(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws IOException, ServletException
    {
        httpservletresponse.setContentType("text/html");
        String s = httpservletrequest.getParameter("cardno");
        String s1 = httpservletrequest.getParameter("bankname");
        String s2 = httpservletrequest.getParameter("name");
        ServletContext servletcontext = getServletContext();
        PrintWriter printwriter = httpservletresponse.getWriter();
        printwriter.println("<html><body>");
        try
        {
            Connection connection = (Connection)servletcontext.getAttribute("con");
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery((new StringBuilder()).append("select * from bank where cardno = '").append(s).append("' and name='").append(s2).append("'").toString());
            if(resultset.next())
            {
                printwriter.println("<html><body><h1>Thank You for Buying. Happy Shopping!!!!!</h1></body></html>");
                printwriter.println("<html><body><h2>Payment Completed!!!!!</h2></body></html>");
                httpservletresponse.setHeader("Refresh", "4;welcome.html");
            } else
            {
                printwriter.println("<html><body><h2>Invalid Details Try Again!!!</h2></body></html>");
                httpservletresponse.setHeader("Refresh", "3;netbank.html");
            }
        }
        catch(Exception exception)
        {
            printwriter.println(exception);
        }
        printwriter.println("</html></body>");
    }
}
