package mypack;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.*;

@Stateless(mappedName="myAdder")
public class AdderBean implements AdderBean
{
@PostConstruct
public void init()
{
	System.out.println("PostConstruct");
}	
@PreDestroy
public void destroy()
{
System.out.println("destroy");	
}
public int add(int x,int y)
{
	return x+y;
}
}