<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Duplicate Page Request</title></head>
<body>
<h3>User Information is not updated, duplicate request detected.</h3>
<h4>Possible Reasons are:</h4>
<ul>
	<li>Back Button usage to submit form again </li>
	<li>Double Click on Submit button</li>
	<li>Using "Reload" option in browser</li>
</ul><br>
<s:if test="hasActionErrors()">
	<s:actionerror/>
</s:if>
</body></html>