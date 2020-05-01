<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<h1>Helloworld From Struts2</h1>
<form action="hello.action">
<label for="name">Please pick a name</label><br/>
<select name="name">
<option name="Mike">Mike</option>
<option name="Jason">Jason</option>
<option name="Mark">Mark</option>
</select>
<input type="submit" value="Say Hello" />
</form>
</body></html>