<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<p>The environment name property can be accessed in three ways: </p>
(Method 1) Environment Name:
<s:property value="environment.name" /> <br />
(Method 2) Environment Name:
<s:push value="environment">
	<s:property value="name" />
(Method 3) Environment Name:
<s:set name="myenv" value="environment">
	<s:property value="myenv" />
</body></html>