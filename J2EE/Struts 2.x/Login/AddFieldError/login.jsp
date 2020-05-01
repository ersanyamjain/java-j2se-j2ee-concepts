<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<s:form action="Login">
	<s:textfield name="userName" label="User Name" />
	<s:password name="password" label="Password" />
	<s:submit value="Login" />
</s:form>
</body></html>