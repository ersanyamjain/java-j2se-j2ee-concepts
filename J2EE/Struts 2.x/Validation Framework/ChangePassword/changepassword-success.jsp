<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Password Change Successful</title>
<link rel="stylesheet" href="mystyle.css" type="text/css" />
</head>
<body>
<h3>Password Changed Successfully</h3>
<p>Your new Password is:
<br><s:property value="password2"/></b>
</p>
<br><br>
|<s:a href="index.jsp">Home</s:a>|
</body></html>