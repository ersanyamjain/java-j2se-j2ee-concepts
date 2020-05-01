<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Basic Validation Successful</title>
<link rel="stylesheet" href="mystyle.css" type="text/css" />
</head>
<body>
<p>Thank You, <b><s:property value="empname" /></b></p>
<p>You Entered following details:</p>
<table spacing="5">
<tr>
<td>Employee ID:</td>
<td><s:property value="empid" /></td>
</tr>
<tr>
<td>Password:</td>
<td><s:property value="password" /></td>
</tr>
<tr>
<td>Employee Name:</td>
<td><s:property value="empname" /></td>
</tr>
<tr>
<td>Date of Joining:</td>
<td><s:property value="doj" /></td>
</tr>
<tr>
<td>Age:</td>
<td><s:property value="age" /></td>
</tr>
<tr>
<td>City:</td>
<td><s:property value="city" /></td>
</tr>
<tr>
<td>Email:</td>
<td><s:property value="email" /></td>
</tr>
</table>
|<s:a href="index.jsp">Home</s:a>|
</body></html>