<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<s:form action="UserAction">
<s:textfield name="user.name" label="User Name" />
<s:textfield name="user.age" label="Age" />
<s:radio name="user.sex" label="Sex" list="{'M','F'}" />
<s:checkboxlist name="user.hobby" label="Hobby" list="{'Music','Art','Dance'}" />
<s:select name="user.country" label="Country" list="{'Select','India','Spain','USA','Denmark'}" />
<s:submit />
</s:form>
</body>
</html>