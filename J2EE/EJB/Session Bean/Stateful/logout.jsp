<%
myejb.Fund f=(myejb.Fund)(session.getAttribute("stub"));
session.invalidate();
out.println("You Have Been Logged Out");
RequestDispatcher rd=request.getRequestDispatcher("index.html");
rd.include(request,response);
%>
