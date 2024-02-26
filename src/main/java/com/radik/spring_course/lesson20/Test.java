package com.radik.spring_course.lesson20;

import com.radik.spring_course.lesson20.entity.Departments;
import com.radik.spring_course.lesson20.entity.Employee;
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
            try(Session session = factory.getCurrentSession()){
                session.beginTransaction();
                System.out.println("Get Department");
                Departments departments = session.get(Departments.class,4);

                System.out.println("Show department \n" + departments);

                session.getTransaction().commit();

                System.out.println("Show employees of the departments \n" + departments.getEmpList());
//                При запуске выбросится исключение по причине типа загрузки lazy. То есть, остальная часть данных запрашивается после закрытия данных.
            }
        } finally {
            factory.close();
        }
    }
}
