package my;

public class User
{
	private String name;
	private int age;
	private String sex;
	private String[] hobby;
	private String country;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getSex()
	{
		return sex;
	}
	public void setSex(String sex)
	{
		this.sex=sex;
	}
	public String[] getHobby()
	{
		return hobby;
	}
	public void setHobby(String[] hobby)
	{
		this.hobby=hobby;
	}public String getCountry()
	{
		return country;
	}
	public void setCountry(String country)
	{
		this.country=country;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}