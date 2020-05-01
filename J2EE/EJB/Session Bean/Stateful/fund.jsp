<%
@page import="javax.naming.*,myejb.*"
%>
<%! private Fund fund=null; %>
<%
try
{
	System.out.println(session.isNew());
	if(session.isNew())
	{
		InitialContext ctx=new InitialContext();
		fund=(Fund)ctx.lookup("myAccount15#myejb.Fund");
		session.setAttribute("stub",fund);
		System.out.println("Inside if()");
	}
	else
	{
		fund=(Fund)session.getAttribute("stub");
		System.out.println("Inside else");
	}
}
catch(Exception e)
{
	System.out.println(e);
}
%>
<%
try
{
	String str1=request.getParameter("txtamt");
	String str2=request.getParameter("action");
	System.out.println(str2);
	double n=Double.parseDouble(str1);
	if(str2.equals("deposite"))
	{
		fund.deposite(n);
	}
	else
	{
		fund.withdraw(n);
	}
	double passAmt=fund.getAmount();
	response.sendRedirect("include.jsp?amt="+passAmt);
}
catch(Exception e)
{
	out.println(e);
}
%>