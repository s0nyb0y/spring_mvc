package com.radik.spring_course.lesson19;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Departments.class)
                .buildSessionFactory();

        try {
            try (Session session = factory.getCurrentSession()) {
                Departments dep = new Departments("HR", 500, 1500);
                Employee emp1 = new Employee("Ivan", "Ivanov", 800);
                Employee emp2 = new Employee("Petr", "Petrov", 1000);
                dep.addEmployeeToDepartment(emp1);
                dep.addEmployeeToDepartment(emp2);
                session.beginTransaction();
//                session.save(dep);
                Departments departments = session.get(Departments.class,3);
                System.out.println(departments.getEmpList());
                session.getTransaction().commit();
            }
        } finally {
            factory.close();
        }
    }
}
