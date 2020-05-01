<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<s:action name="hello" executeResult="true">
Output from Hello: <br/>
</s:action>

<s:iterator value="#attr.names">
	<s:property /><br/>
</s:iterator>
</body></html>