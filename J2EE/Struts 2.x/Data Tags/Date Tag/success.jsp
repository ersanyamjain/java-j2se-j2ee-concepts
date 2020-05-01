<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<h2>Current Date</h2>
<h3>Day/Month/Year Format</h3>
<s:date name="currentDate" format="dd/MM/yyyy hh:mm" />
<h3>Month/Day/Year Format</h3>
<s:date name="currentDate" format="MM/dd/yyyy" />
</body></html>