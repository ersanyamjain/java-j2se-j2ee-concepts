<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<b>Example of Generator Tag</b><br/>
<h3>The Colors of Rainbow: </h3>
<s:generator val="%{'Violet,Indigo,Blue,Green,Yellow,Orange,Red'}" count="10" separator=",">
<s:iterator>
	<s:property />
</s:iterator>
</s:generator>
</body></html>