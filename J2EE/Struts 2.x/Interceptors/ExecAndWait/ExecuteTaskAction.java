package my;
import java.util.Date;
import com.opensymphony.xwork2.ActionSupport;

public class ExecuteTaskAction extends ActionSupport
{
	
	private int processingTime;
	@Override
	public String execute()
	{
		//Process task for given time
		System.out.println("Starting execution. Current Time: "+new Date());
		processTask();
		System.out.println("Ending execution. Current Time: "+new Date());
			return SUCCESS;	
	}	
	private void processTask()
	{
		System.out.println("Time to Process: "+processingTime);
		try
		{
			Thread.sleep(getProcessingTime()*1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public int getProcessingTime()
	{
		return processingTime;
	}
	public void setProcessingTime(int processingTime)
	{
		this.processingTime=processingTime;
	}
}