<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<% String name=(String)request.getAttribute("name");
out.println(name);
out.println("<br>"); %>
<h1><s:property value="message" /></h1>
</body></html>