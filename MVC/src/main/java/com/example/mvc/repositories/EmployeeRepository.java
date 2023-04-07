package com.example.mvc.repositories;

import com.example.mvc.config.Config;
import com.example.mvc.entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class EmployeeRepository {
    private final SessionFactory sessionFactory = new Config().buildSessionFactory();

    public void create(Employee e) {
//        Employee e = new Employee(001, "Vo", "Hieu", 3000);
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(e);

        session.getTransaction().commit();
        session.close();
    }

    public Employee findByID(String id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Employee e = session.createNativeQuery("select * from employee where id=" + id, Employee.class).getSingleResult();

        session.getTransaction().commit();
        session.close();
        return e;
    }

    public List<Employee> findAll() {
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        String query = "select * from employee";
        List<Employee> eList = session.createNativeQuery(query, Employee.class).getResultList();

        session.getTransaction().commit();
        session.close();

        return eList;
    }


    public void update(Employee e) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.update(e);

        session.getTransaction().commit();
        session.close();
    }

    public void delete(Employee id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(id);

        session.getTransaction().commit();
        session.close();
    }
}
