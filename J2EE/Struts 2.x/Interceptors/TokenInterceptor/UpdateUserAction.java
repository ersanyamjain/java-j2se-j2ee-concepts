package my;
import java.util.Date;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateUserAction extends ActionSupport
{
	private String name;
	private String address;
	private Date updateTime;
	
	@Override
	public String execute()
	{
		System.out.println("***Update Request Arrived to Action class***");
		setUpdateTime(new Date());
		return SUCCESS;
	}	
	@Override
	public void validate()
	{
		if(isEmpty(getName()))
		{
			addActionError("Name can't be empty");
			if(isEmpty(getAddress()))
			{
				addActionError("Address can't be empty");
			}
		}
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	public void setUpdateTime(Date updateTime)
	{
		this.updateTime=updateTime;
	}
	public Date getUpdateTime()
	{
		return updateTime;
	}
	private boolean isEmpty(String str)
	{
		return str==null?true:(str.equals("")?true:false);
	}
}