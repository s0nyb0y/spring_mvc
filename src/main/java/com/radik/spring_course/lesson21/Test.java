package com.radik.spring_course.lesson21;

import com.radik.spring_course.lesson21.entity.Children;
import com.radik.spring_course.lesson21.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Children.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();


        try {
            try (Session session = factory.getCurrentSession()) {

                Section section1 = new Section("Football");

                Children children1 = new Children("Anton", 10);
                Children children2 = new Children("Ivan", 9);
                Children children3 = new Children("Masha", 7);

                section1.addChildrenToSection(children1);
                section1.addChildrenToSection(children2);
                section1.addChildrenToSection(children3);

                Section section2 = new Section("Volleyball");
                Section section3 = new Section("Chess");
                Section section4 = new Section("Math");

                Children children4 = new Children("Igor", 8);
                children4.addSectionToChild(section2);
                children4.addSectionToChild(section3);
                children4.addSectionToChild(section4);

                session.beginTransaction();
                session.persist(section1);
                session.persist(children4);

                Section section = session.get(Section.class, 1);
                System.out.println(section + "\n" + section.getChildrenList());

                Children children = session.get(Children.class, 4);
                System.out.println(children + "\n" + children.getSectionList());

                session.remove(section);

                session.getTransaction().commit();
            }
        } finally {
            factory.close();
        }
    }
}
