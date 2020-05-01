<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head><title>Value Stack Demo</title></head>
<body>
<h1>Its Value Stack Demo from Struts 2</h1>
<form action="hello.action">
<label for="name">Please enter your name</label><br />
<input type="text" name="name" />
<input type="submit" value="Say Hello" />
</form>
</body>
</html>