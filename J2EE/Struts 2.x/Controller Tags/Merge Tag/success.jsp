<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<s:merge id="allemployees">
	<s:param value="employees" />
	<s:param value="contractors" />
</s:merge>
<s:iterator value="allemployees">
	<s:property value="name" />
	<s:property value="department" /><br/>
</s:iterator>
</body></html>