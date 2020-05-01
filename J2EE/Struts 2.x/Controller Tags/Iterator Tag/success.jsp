<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<b>Example of Iterator Tag</b><br/>
<s:iterator value="employees">
	<s:property value="name" />
	<s:property value="department" /><br/>
</s:iterator>
<br/><br/>
<s:iterator value="contractors">
	<s:property value="name" />
	<s:property value="department" /><br/>
</s:iterator>
</body></html>