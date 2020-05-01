<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Using Field Validators - Add Employee</title></head>
<body>
<h3>Using Field Validators</h3>
<b>Enter new employee details:</b>
<s:form action="addEmployee">
<s:textfield label="Employee ID" name="empid" />
<s:password label="Password" name="password" />
<s:password label="Re-Enter Password" name="password1" />
<s:textfield label="Employee Name" name="empname" />
<s:textfield label="Date of Joining" name="doj" />
<s:textfield label="Age" name="age" />
<s:textfield label="City" name="city" />
<s:textfield label="Email" name="email" />
<s:submit value="Add Employee" />
</s:form>
<br><br>
|<s:a href="index.jsp">Home</s:a>|
</body></html>