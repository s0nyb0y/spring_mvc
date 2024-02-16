package com.radik.spring_course.lesson14;

import com.radik.spring_course.lesson14.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            List<Employee> employees = session.createQuery(" from Employee")
                    .getResultList();
            List<Employee> emp = session.createQuery(" from Employee where name = 'Elena'")
                    .getResultList();
            for (Employee e : employees) {
                System.out.println(e);
            }
            System.out.println(emp);
            Employee employee = session.get(Employee.class, 1);
            session.getTransaction().commit();
            System.out.println(employee);
        } finally {
            factory.close();
        }
    }
}
