import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.MessageDriven;
import javax.jms.JMSException;
import javax.jms.*;
import javax.jms.MessageListener;

@MessageDriven(mappedName="testQueue3",activationConfig={@ActivationConfigProperty(propertyName="destinationType",propertyValue="javax.jms.Queue")})
public class MessageBean1 implements MessageListener
{
	Logger logger = Logger.getLogger("test");
	public void onMessage(Message msg)
	{
		TextMessage tm=(TextMessage)msg;
		try
		{
			String text=tm.getText();
			String name=msg.getStringProperty("name");
			System.out.println(text+name);
		}
		catch(JMSException e)
		{
			e.printStackTrace();
		}
	}
}