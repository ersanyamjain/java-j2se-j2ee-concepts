<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Update User Request Page</title></head>
<body>
<s:if test="hasActionErrors()">
<s:actionerror/>
</s:if><br>
<s:form action="UpdateUser">
	<s:textfield name="name" label="User Name" >
	</s:textfield>
	<s:textfield name="address" label="Address" >
	</s:textfield>
	<s:submit value="Update" name="submit" >
	</s:submit>
	<%-- add token to JSP to be used by Token Interceptor --%>
	<s:token/>
</s:form>
</body></html>