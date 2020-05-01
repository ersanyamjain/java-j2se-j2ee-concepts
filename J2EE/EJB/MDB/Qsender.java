import javax.naming.*;
import javax.jms.*;
import java.util.*;

public class Qsender
{
	public static void main(String args[]) throws Exception
	{
		try
		{
		Properties parm=new Properties();
		parm.setProperty("java.naming.factory.initial","weblogic.jndi.WLInitialContextFactory");
		parm.setProperty("java.naming.factory.url","t3://localhost:7001");
		parm.setProperty("java.naming.security.principal","weblogic");
		parm.setProperty("java.naming.security.credentials","weblogic");
		InitialContext ctx=new InitialContext(parm);
		QueueConnectionFactory cf=(QueueConnectionFactory)ctx.lookup("TopicConnectionFactory3");
		QueueConnection tc=cf.createQueueConnection();
		tc.start();
		QueueSession session=tc.createQueueSession(false,Session.AUTO_ACKNOWLEDGE);
		javax.jms.Queue newQueue=(javax.jms.Queue)ctx.lookup("testQueue3");
		QueueSender sender=session.createSender(newQueue);
		TextMessage tm=session.createTextMessage();
		tm.setText("queue message");
		tm.setStringProperty("name","MessageServlet");
		sender.send(tm);
		System.out.println("Message sent ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}