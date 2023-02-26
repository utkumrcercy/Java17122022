package com.mehmetnuri.core.service;

import com.mehmetnuri.core.dao.GenericDao;
import com.mehmetnuri.core.dao.IGenericDao;
import org.hibernate.SessionFactory;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class GenericService<T> implements IGenericServisDao<T> {


    private IGenericDao<T> dao;
    private Class<T> clazz;

    public GenericService(Class<T> clazz , SessionFactory sessionFactory) {

        this.clazz = clazz;
        this.dao = new GenericDao<T>(clazz, sessionFactory);
    }

    @Override
    public T get(Class<T> clazz, Long id) {
        return (T) dao.get(clazz,id);
    }

    @Override
    public T save(T entity) {
        return (T) dao.save(entity);
    }

    @Override
    public T update(T entity) {
        return (T) dao.update(entity);
    }

    @Override
    public Boolean delete(T entity) {
        return dao.delete(entity);
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }


    @Override
    public List<T> query(String hql, Map<String, Objects> params) {
        return (List<T>) dao.query(hql, params);
    }

    @Override
    public List<T> getAll() {
        return query("from " + clazz.getName(), null);
    }

    @Override
    public void deleteAll() {
        query("delete from " + clazz.getName(), null);
    }
}
