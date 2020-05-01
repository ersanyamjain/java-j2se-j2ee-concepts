<%@taglib uri="/struts-tags" prefix="s" %>
<html><body>
<h1>Bean Tag</h1>
<form action="HelloWorld.action">
<label for="name">Please pick a name </label>
<br/>
<select name="name">
<option name="lalu">Lalu</option>
<option name="rabari">Rabari</option>
<option name="meesa">Meesa</option>
</select>
<input type="submit" value="Say Hello" />
</form>
</body></html>