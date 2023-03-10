package com.example.ex4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "registerServlet", value = "/register-servlet")
public class RegistrationForm extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String tel = request.getParameter("tel");
        String html = "<br>" + "<html>"
                + "<head>" + "<title>Result Page</title>"
                + "</head>" + "<body>"
                + "Khoa Công nghệ thông tin  - Đại học Công nghiệp TP.Hồ Chí Minh <br> "
                + "Name: " + name + "<br>"
                + "Email: " + email + "<br>"
                + "Tel: " + tel + "<br>"
                + "</body>" + "</html>";
        out.println(html);
    }
}

