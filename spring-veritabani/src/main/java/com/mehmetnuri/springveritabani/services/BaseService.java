package com.mehmetnuri.springveritabani.services;

import com.mehmetnuri.springveritabani.dao.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService <T , R extends BaseRepository> {

    @Autowired
    private R repository;


    public List<T> findAll() {
        return (List<T>) repository.findAll();
    }

    public T save(T t) {
        return (T) repository.save(t);
    }

    public void delete(Long id) {
        repository.deleteById(id);

    }

}
