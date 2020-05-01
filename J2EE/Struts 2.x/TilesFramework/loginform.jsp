<%@taglib uri="/struts-tags" prefix="s" %>
<table bgcolor="#a362b3" width="400" width="400" align="center" cellpadding="10">
	<tr>
		<td align="center">
		|Login|
		<br>
		<s:actionerror/>
		<s:form action="login" method="post">
			<s:textfield name="loginid" key="app.loginid"/>
			<s:password name="password" key="app.password"/>
			<s:submit value="Login"/>
		</s:form>
		</td>
	</tr>
</table>