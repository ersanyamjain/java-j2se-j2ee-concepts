<%
out.println("Amount = "+request.getParameter("amt"));
out.println("<a href=logout.jsp>LOGOUT</a>");
%>
<jsp: include page="index.html"/>