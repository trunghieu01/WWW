<%@ page import="com.example.mvc.entities.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit selected user</title>
    <%
        Employee e = (Employee) session.getAttribute("selE");
    %>
    <form action="Controller">
        <input type="hidden" name="action" value="update"/>

        <h1>User ID:<input name="id" readonly="true" value="<%=e.getId()%>"/></h1>
        Enter username:<input name="firstname" maxlength="50"  value="<%=e.getFirstName()%>" /><br/>

        Enter lastname:<input name="lastname"  maxlength="50" value="<%=e.getLastName()%>" /><br/>
        Enter salary:<input name="salary" maxlength="50" value="<%=e.getSalary()%>"/><br/>
        <input type="submit" value="Update"/>
    </form>
</head>
<body>

</body>
</html>
