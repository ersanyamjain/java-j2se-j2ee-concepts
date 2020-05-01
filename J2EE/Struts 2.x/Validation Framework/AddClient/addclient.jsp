<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Struts 2 Validation</title></head>
<body>
<h2>A Basic Struts 2 Validation </h2>
<b>Enter new client details:</b>
<s:form action="addClient">
<s:textfield label="Name" name="name" required="true" />
<s:textfield label="Age" name="age" required="true" />
<s:textfield label="Nationality" name="nation" required="true" />
<s:submit value="Add Client" />
</s:form>

|<s:a href="index.jsp">Home</s:a><br><br>
</body></html>