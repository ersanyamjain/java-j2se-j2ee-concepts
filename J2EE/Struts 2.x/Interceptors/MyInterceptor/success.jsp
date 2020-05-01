<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Success</title></head>
<body>
<h1>Login Success</h1>
UserName ${userName}
<br>
User Password ${password}
<br>
<s:a href="login.jsp">Back</s:a>
</body></html>