import javax.naming.*;
import javax.jms.*;
import java.util.*;

public class Qreceiver
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
		QueueReceiver ts=session.createReceiver(newQueue);
		ts.setMessageListener(new MyMessageListener());
		while(true)
		{
			Thread.sleep(1000);
		}
		}
		catch(Exception e)
		{
			System.out.println("1: "+e);
		}
	}
}

class MyMessageListener implements MessageListener
{
	public void onMessage(Message msg)
	{
		try
		{
			if(msg instanceof TextMessage)
			{
				TextMessage txtMsg=(TextMessage)msg;
				String str=txtMsg.getText();
				System.out.println(str);
			}
			else
			{
				System.out.println("Message in Unknown Format");
			}
		}
		catch(JMSException e)
		{}
	}
}