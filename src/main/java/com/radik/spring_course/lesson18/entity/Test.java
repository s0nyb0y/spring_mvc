package com.radik.spring_course.lesson18.entity;

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
                Departments dep = new Departments("IT", 300, 1200);
                Employee emp1 = new Employee("Anton", "Petrov", 800);
                Employee emp2 = new Employee("Petr", "Ivanov", 1000);
                dep.addEmployeeToDepartment(emp1);
                dep.addEmployeeToDepartment(emp2);

                session.beginTransaction();
                session.save(dep);
                Departments department = session.get(Departments.class, 2);
                System.out.println(department.getEmpsList());
                Employee employee = session.get(Employee.class, 3);
                System.out.println(employee.getDepartment());
                Employee emp = session.get(Employee.class, 1);
                session.remove(emp);
                session.getTransaction().commit();
            }
        } finally {
            factory.close();
        }
    }
}
