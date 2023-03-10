package com.example.ex2;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "ChangePasswordServlet", value = "/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String pass = request.getParameter("password");
        String gender = request.getParameter("gender");

        Account a = new Account(firstName,lastName,email,pass,gender);

        ConnectDB db = new ConnectDB();
        try {
            db.update(a);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        RequestDispatcher requetsDispatcherObj =request.getRequestDispatcher("index.jsp");
        requetsDispatcherObj.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);

//        String firstName = req.getParameter("firstName");
//        String lastName = req.getParameter("lastName");
//        String email = req.getParameter("email");
//        String pass = req.getParameter("password");
//        String gender = req.getParameter("gender");
//
//        Account a = new Account(firstName,lastName,email,pass,gender);
//
//        ConnectDB db = new ConnectDB();
//        try {
//            db.update(a);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    }
}
