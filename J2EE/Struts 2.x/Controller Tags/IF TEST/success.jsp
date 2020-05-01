<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<b>Example of If & Else Tag</b><br/>
<s:if test="name=='Mike'">
You Have Selected 'Mike'.
</s:if>
<s:elseif test="name=='Jason'">
You Have Selected 'Jason'.
</s:elseif>
<s:else>
You Have not Selected 'Mike' or 'Jason'.
</s:else>
</body></html>