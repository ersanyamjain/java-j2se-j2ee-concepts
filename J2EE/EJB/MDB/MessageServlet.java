import javax.annotation.Resource;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.jms.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name="MessageServlet",urlPatterns={"/mdb"})
public class MessageServlet extends HttpServlet
{
	@Resource(mappedName="testQueue3")
	private Queue queue;
	@Resource(mappedName="TopiConnectionFactory3")
	private QueueConnectionFactory queueconfac;
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		QueueConnection queueConnection=null;
		try
		{
			queueConnection=queueconfac.createQueueConnection();
			queueConnection.start();
			QueueSession queueSession=queueConnection.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
			QueueSender sender=queueSession.createSender(queue);
			TextMessage msg=queueSession.createTextMessage();
			msg.setText("message from servlet");
			msg.setStringProperty("name","MessageServlet");
			sender.send(msg);
		}
		catch(JMSException e)
		{
			throw new RunTimeException(e);
		}
		finally
		{
			try
			{
			if(queueConnection!=null)
			{
				queueConnection.close();
			}				
			}
			catch(JMSException e)
			{	}
		}
	}
}