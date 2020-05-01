import java.util.*;
import javax.jms.*;
import javax.naming.*;

public class Subscriber
{
	public static void main(String args[])
	{
		try
		{
		Properties parm=new Properties();
		parm.setProperty("java.naming.factory.initial","weblogic.jndi.WLInitialContextFactory");
		parm.setProperty("java.naming.provider.url","t3://localhost:7001");
		parm.setProperty("java.naming.security.principal","weblogic");
		parm.setProperty("java.naming.security.credentials","weblogic15");
		InitialContext ctx=new InitialContext(parm);
		TopicConnectionFactory topicFac=(TopicConnectionFactory) ctx.lookup("TopicConnectionFactory3");
		TopicConnection con=topicFac.createTopicConnection();
		con.start();
		TopicSession session=con.createTopicSession(false,TopicSession.AUTO_ACKNOWLEDGE);
		Topic t=(Topic)ctx.lookup("MyTopic3");
		
		TopicSubscriber sub=session.createSubscriber(t);
		sub.setMessageListener(new MyMessageListener());
		while(true)
		{
			Thread.sleep(1000);
			System.out.print(".");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
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
				System.out.println("Message is of Unknown Format");
			}
		}
		catch(JMSException e)
		{
			System.out.println(e);
		}
	}
}