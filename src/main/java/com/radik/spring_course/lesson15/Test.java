package com.radik.spring_course.lesson15;

import com.radik.spring_course.lesson15.entity.Employee;
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
            session.createQuery(" update Employee set salary = 1000" +
                    " where department = 'HR'").executeUpdate();
            session.createQuery(" delete Employee where name = 'Zaur'").executeUpdate();
            List<Employee> emps = session.createQuery(" from Employee").getResultList();
            for (Employee emp:emps){
                System.out.println(emp);
            }
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
