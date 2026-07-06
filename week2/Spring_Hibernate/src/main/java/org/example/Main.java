package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        Session session = factory.openSession();

        Employee emp = new Employee(101, "Sesha");

        session.beginTransaction();
        session.persist(emp);
        session.getTransaction().commit();

        session.close();
        factory.close();

        System.out.println("Employee inserted successfully.");
    }
}