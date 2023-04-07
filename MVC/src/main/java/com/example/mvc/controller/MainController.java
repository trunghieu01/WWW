package com.example.mvc.controller;

import com.example.mvc.entities.Employee;
import com.example.mvc.services.EmployeeService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Controller")
public class MainController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String action = request.getParameter("action");
        EmployeeService employeeService = new EmployeeService();
        HttpSession session = request.getSession(true);


        switch (action) {
            case "list":
                List<Employee> lst = employeeService.findAll();
                session.setAttribute("employee", lst);
                response.sendRedirect("list_employees.jsp");
                break;
            case "addView":
                response.sendRedirect("new_employee.jsp");
                break;
            case "add":
                int id = Integer.parseInt(request.getParameter("id"));
                String firstName = request.getParameter("firstName");
                String lastName = request.getParameter("lastName");
                int salary = Integer.parseInt(request.getParameter("salary"));
                Employee e = new Employee(id, firstName, lastName, salary);
                employeeService.insert(e);
                response.sendRedirect("Controller?action=list");
                break;
            case "editView":
                Employee selE = employeeService.findById(request.getParameter("id"));
                System.out.println(selE.toString());
                session.setAttribute("selE", selE);
                response.sendRedirect("edit.jsp");
                break;
            case "update":
                int id1 = Integer.parseInt(request.getParameter("id"));
                String firstName1 = request.getParameter("firstname");
                String lastName1 = request.getParameter("lastname");
                int salary1 = Integer.parseInt(request.getParameter("salary"));
                employeeService.update(new Employee(id1, firstName1, lastName1, salary1));
                response.sendRedirect("Controller?action=list");
                break;
            case "delete":
                int del_Id= Integer.parseInt(request.getParameter("id"));
                Employee employee = new Employee(del_Id);
                employeeService.delete(employee);
                response.sendRedirect("Controller?action=list");
                break;
        }
    }
}
