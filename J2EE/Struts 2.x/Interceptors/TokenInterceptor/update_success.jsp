<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Update User Success Page</title></head>
<body>
<h3>User Information Updated Successfully.</h3>
Name: <s:property value="name"/>
<br>
Address:<s:property value="address" />
<br>
Update Time:<s:property value="updateTime" />
<br>
<%-- <s:date name="updateTime" /> --%>
</body></html>