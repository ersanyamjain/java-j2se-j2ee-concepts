<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<% String s=(String)session.getAttribute("name");
out.println(s); %>
<br><h1><s:property value="#session.name" /></h1>
<s:property value="#session['name']" />
<br>
<s:property value="message" />
</body></html>