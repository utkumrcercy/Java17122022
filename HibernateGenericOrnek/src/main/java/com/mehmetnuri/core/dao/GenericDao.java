package com.mehmetnuri.core.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GenericDao<T> implements IGenericDao<T> {


    private SessionFactory sessionFactory;

    public GenericDao(Class<T> clazz, SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        if (sessionFactory == null) {
            throw new RuntimeException("Session factoru null!");
        }
    }

    @Override
    public T get(Class<T> clazz, Long id) {

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        @SuppressWarnings("uncheked")
        T elemet = (T) session.get(clazz, id);
        session.getTransaction().commit();
        return elemet;
    }

    @Override
    public T save(T entity) {

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public T update(T entity) {

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public Boolean delete(T entity) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
        return Boolean.TRUE;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }


    @Override
    public List<T> query(String hql, Map<String, Objects> params) {

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery(hql);
        if (params != null) {

            for (String s : params.keySet()) {
                query.setParameter(s, params.get(s));
            }
        }

        List<T> results = null;

        if ((hql.toUpperCase().indexOf("DELETE") == -1) && (hql.toUpperCase().indexOf("UPDATE") == -1) && (hql.toUpperCase().indexOf("INSERT") == -1)) {

            results = query.list();
        }

        session.getTransaction().commit();
        return results;

    }
}
