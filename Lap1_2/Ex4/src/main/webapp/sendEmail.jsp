<%--
  Created by IntelliJ IDEA.
  User: thang
  Date: 3/4/2023
  Time: 10:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send Email</title>
</head>
<body>

<form method="post" action="email-servlet" enctype="multipart/form-data" id="form">
    <h3>Enter your Email</h3>
    <input type="email" name="email"/>
    <input type="submit"/>
</form>

</body>
</html>
