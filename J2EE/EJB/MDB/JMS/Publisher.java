import java.util.*;
import javax.jms.*;
import javax.naming.*;

public class Publisher
{
	public static void main(String args[]) throws Exception
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
		TopicPublisher pub=session.createPublisher(t);
		TextMessage txtMsg=session.createTextMessage();
		txtMsg.setText("JMS is wecoming you.");
		pub.publish(txtMsg);
		System.out.println("Message Sent Successfully");
		session.close();
		con.close();
	}
}