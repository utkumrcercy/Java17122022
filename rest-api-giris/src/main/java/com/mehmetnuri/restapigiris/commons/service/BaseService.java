package com.mehmetnuri.restapigiris.commons.service;

import com.mehmetnuri.restapigiris.commons.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService<T, R extends BaseRepository> {

    @Autowired
    private R repository;

    public List<T> findAll() {
        return (List<T>) repository.findAll();
    }

    public T findById(Long id) {
        return (T) repository.findById(id);
    }
    public T save(T entity) {
        return (T) repository.save(entity);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void delete(T entity) {
        repository.delete(entity);
    }
}
