<%@page import="com.example.ex1"%>
<%@ page import="com.example.ex1.entity.Student" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Result submit</title>
</head>
<body>
<%
    Student svt= new Student();
    svt = (Student)request.getAttribute("student");
    out.println("First name:" + svt.getFirstName()
            + "<br/> Last name: " + svt.getLastName()
            + "<br/> Email : " + svt.getEmail()
            + "<br/> Gender: " +svt.getGender()
            + "<br/> Hobbies: " + svt.getHobbies()
            + "<br/> Birthday: " + svt.getBirthDay()
    );
%>
</body>
</html>