package com.mehmetnuri.core.service;

import com.mehmetnuri.core.dao.IGenericDao;

import java.util.List;

public interface IGenericServisDao<T> extends IGenericDao<T> {

    List<T> getAll();

    void deleteAll();
}
