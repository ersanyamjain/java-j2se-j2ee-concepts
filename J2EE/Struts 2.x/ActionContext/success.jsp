<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<% 
String name=(String)request.getAttribute("name");
out.println(name);
out.println("<br>");
String name1=(String)session.getAttribute("name");
out.println(name1);
out.println("<br>");
String name2=(String)application.getAttribute("name2");
out.println(name2);
out.println("<br>");
%>
<h1><s:property value="message" /></h1>
</body></html>