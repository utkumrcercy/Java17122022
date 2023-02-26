package com.mehmetnuri.core.dao;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public interface IGenericDao<T> {

    public T get(Class<T> clazz, Long id);

    public T save(T entity);

    public T update(T entity);

    public Boolean delete(T entity);

    public Boolean delete(Long id);


    public List<T> query(String hql, Map<String, Objects> params);

}
