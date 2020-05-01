<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Long Process Input Page</title></head>
<body>
<h3>ExecAndWait Interceptor Example</h3>
<s:form action="ExecuteTask">
	<s:textfield name="processingTime" label="Enter seconds to execute task" />
	<s:submit name="submit" label="Run" align="center">
	</s:submit>
</s:form>
</body></html>