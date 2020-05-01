<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<% String s=(String)application.getAttribute("name");
out.println(s); %>
<h1><s:property value="#application.name" /></h1>
<s:property value="#application['name']" />
<br>
<s:property value="message" />
</body></html>