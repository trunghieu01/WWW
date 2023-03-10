package com.example.ex1.servlet;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.example.ex1.entity.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "registerServlet", value = "/register-servlet")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter dt = response.getWriter();
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String email = request.getParameter("email");
        String mobileNum = request.getParameter("phone");
        String gender = request.getParameter("gender");
        String address = request.getParameter("address");
        String city = request.getParameter("city");
        String pinCode = request.getParameter("pin-code");
        String state = request.getParameter("state");
        String country = request.getParameter("country");
        String hobbies = Arrays.toString(request.getParameterValues("hobbies"));
        String course = request.getParameter("course");

        Date birthdate = null;
        try {
            birthdate = new SimpleDateFormat("yyyy-MM-dd").parse(request.getParameter("birthday"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        Student sv = new Student(fname,lname,email,gender,address,city,state,city,hobbies,mobileNum,birthdate);
        request.setAttribute("student", sv);
        Student svt= new Student();
        svt = (Student)request.getAttribute("student");
        dt.println("First name:" + svt.getFirstName()
                + "<br/> Last name: " + svt.getLastName()
                + "<br/> Email : " + svt.getEmail()
                + "<br/> Gender: " +svt.getGender()
                + "<br/> Hobbies: " + svt.getHobbies()
                + "<br/> Birthday: " + svt.getBirthDay()
        );
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}

