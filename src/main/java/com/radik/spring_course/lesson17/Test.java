package com.radik.spring_course.lesson17;

import com.radik.spring_course.lesson17.entity.Detail;
import com.radik.spring_course.lesson17.entity.Employee;
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
            try (Session session = factory.getCurrentSession()) {
                session.beginTransaction();
                Detail deleteDetail = session.get(Detail.class, 4);
                deleteDetail.getEmployee().setEmpDetail(null);
                session.remove(deleteDetail);
                System.out.println(deleteDetail);
                session.getTransaction().commit();
            }
        } finally {
            factory.close();
        }
    }
}
