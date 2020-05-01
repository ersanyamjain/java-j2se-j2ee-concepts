<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<br><br>
<s:url id="login" action="login" var="myurl">
	<s:param name="user">Zara</s:param>
</s:url>
<a href='<s:property value="#myurl"/>'>
<s:property value="#myurl" /></a>
</body></html>