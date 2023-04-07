package com.example.mvc.services;

import com.example.mvc.entities.Employee;
import com.example.mvc.repositories.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private EmployeeRepository employeeRepository = new EmployeeRepository();

    public List<Employee> findAll(){
        for (Employee e : employeeRepository.findAll()){
            System.out.println("Id: " + e.getId());
            System.out.println("Name: " + e.getFirstName() +" "+ e.getLastName());
            System.out.println("Salary: " + e.getSalary());
        }
        return employeeRepository.findAll();
    }

    public Employee findById(String id){
        System.out.println(employeeRepository.findByID(id).toString());
        return employeeRepository.findByID(id);
    }
    public void insert(Employee e){
        employeeRepository.create(e);
    }

    public void update(Employee e){
        employeeRepository.update(e);
    }

    public void delete(Employee id){
        employeeRepository.delete(id);
    }
}
