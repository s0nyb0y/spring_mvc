package com.radik.spring_course.lesson16;

import com.radik.spring_course.lesson16.entity.Detail;
import com.radik.spring_course.lesson16.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        try {
            Employee employee = new Employee("Oleg", "Smirnov", "Sales", 550);
            Detail detail = new Detail("Moscow", "123456785", "olejka@gmail.com");

            try (Session session = factory.getCurrentSession();) {
                session.beginTransaction();
                employee.setEmpDetail(detail);
            session.save(employee);
                Employee emp = session.get(Employee.class, 1);
                session.remove(emp);
                System.out.println(emp.getEmpDetail());
                session.getTransaction().commit();
            }

        } finally {
            factory.close();
        }
    }
}
