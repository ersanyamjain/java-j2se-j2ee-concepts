<%@page import="mypack.Adder,javax.naming.*"
%>

<%
try
{
	Object o=application.getAttribute("stub");
	Adder stub;
	if(o==null)
	{
		initialContext ctx=new InitialContext();
		stub=(Adder)ctx.lookup("myAdder#mypack.Adder");
		application.setAttibute("stub",stub);
	}
	else
		stub=(Adder)o;
	int a=Integer.parseInt(request.getParameter("txtnum1"));
	int b=Integer.parseInt(request.getParameter("txtnum2"));
	int c=stub.add(a,b);
	// out.println("<p>Sum is: "+c);
	response.sendRedirect("include.jsp?key="+c);
}
catch(Exception e)
{
	out.println(e);
}
%>