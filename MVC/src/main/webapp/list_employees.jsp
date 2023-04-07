<%@ page import="java.util.List" %>
<%@ page import="com.example.mvc.entities.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Employee</title>
</head>
<body>
    <%
        List<Employee> lstE = (List<Employee>) session.getAttribute("employee");
    %>

    <br/>
    <table border="1" width="80%" align="center">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>email</th>
            <th>password</th>
            <th>State</th>
            <th><a href="Controller?action=addView">Add New User</a></th>
        </tr>
    <%
        for(Employee e: lstE){
    %>
        <tr>
            <td><%=e.getId()%></td>
            <td><%=e.getFirstName()%></td>
            <td><%=e.getLastName()%></td>
            <td><%=e.getSalary()%></td>
            <td>
                <a href="Controller?action=editView&&id=<%=e.getId()%>">Edit</a>
                <a href=""
                   onclick='if(confirm("Are you sure to execute this action?"))
                    {window.open("Controller?action=delete&&id=<%=e.getId()%>");window.close();}'
                >Delete</a>
            </td>
        </tr>
    <%
        }
    %>
    </table>
</body>
</html>
