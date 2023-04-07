<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New USer</title>
</head>
<body>
  <form action="Controller">
    <input type="hidden" name="action" value="add"/>

    Enter ID:<input name="id" maxlength="50"/><br/>
    Enter FirstName:<input name="firstName" maxlength="50"/><br/>
    Enter LastName:<input name="lastName" maxlength="50"/><br/>
    Enter Salary:<input name="salary" maxlength="50"/><br/>
    <input type="hidden" name="state" value="disable"/>
    <input type="submit" value="Save"/>
  </form>

</body>
</html>
