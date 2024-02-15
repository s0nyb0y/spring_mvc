package com.radik.spring_course.lesson13;

import com.radik.spring_course.lesson13.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Employee emp1 = new Employee("Zaur","Tregulov","IT",500);
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(emp1);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
