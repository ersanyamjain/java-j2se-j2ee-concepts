<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<s:if test="hasActionErrors()">
	<s:actionerror />
</s:if>
<s:if test="hasActionMessages()">
	<s:actionmessage />
</s:if>

<s:form action="Login">
	<s:textfield name="userName" label="User Name" />
	<s:password name="password" label="Password" />
	<s:submit value="Login" />
</s:form>
</body></html>