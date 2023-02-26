package com.mehmetnuri.core.utils;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {

    private static final SessionFactory SESSION_FACTORY = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

        try {
            Configuration cfg = new Configuration();
            SessionFactory sessionFactory = cfg.configure().buildSessionFactory();
            return sessionFactory;
        } catch (Exception e) {
            System.out.println("Sesion oluşturulurken hata oluştu");
            throw new ExceptionInInitializerError(e);
        }

    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }

    public static Session getSession() throws HibernateException {
        return SESSION_FACTORY.openSession();
    }
}
