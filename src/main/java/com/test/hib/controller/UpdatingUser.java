package com.test.hib.controller;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.test.hib.model.User;

public class UpdatingUser {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        int USER_ID = 4;
        User u = session.load(User.class, USER_ID);
        u.setEmail("mhaseeb@perscholas");
        u.setFullName("M haseeb");
        u.setPassword("123456");
        session.merge(u);
        session.getTransaction().commit();
        session.close();
    }
}