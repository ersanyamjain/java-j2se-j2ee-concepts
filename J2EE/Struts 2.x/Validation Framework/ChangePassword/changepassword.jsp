<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Using Non-Field Validators - Change Password</title></head>
<body>
<h3>Using Non-Field Validators</h3>
<b>Change Password:</b>
<s:actionerror/>
<s:form action="changePassword" validate="true">
<s:password label="Current Password" name="password" />
<s:password label="New Password" name="password2" />
<s:password label="Re-Enter New Password" name="password3" />
<s:submit value="Change Password" />
</s:form>
<br><br>
|<s:a href="index.jsp">Home</s:a>|
</body></html>