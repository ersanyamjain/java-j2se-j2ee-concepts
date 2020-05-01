<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Basic Validation Successful</title>
<link rel="stylesheet" href="mystyle.css" type="text/css" />
</head>
<body>
<p>Thank You, <b><s:property value="name" /></b></p>
<p>You Entered following details:</p>
<ul>
<li>Name:<s:property value="name" /></li>
<li>Age:<s:property value="age" /></li>
<li>Nationality:<s:property value="nation" /></li>
</ul>
|<s:a href="index.jsp">Home</s:a>|
</body></html>