<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<s:bean name="org.apache.struts2.util.Counter" var="counter">
	<s:param name="first" value="10" />
	<s:param name="last" value="25" />
</s:bean>
<ul>
<s:iterator value="#counter">
<li><s:property value="name" /></li>
</s:iterator>
</ul>
</body></html>