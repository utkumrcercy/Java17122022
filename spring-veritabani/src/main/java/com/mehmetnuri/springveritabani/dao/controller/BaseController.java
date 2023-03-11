package com.mehmetnuri.springveritabani.dao.controller;

import com.mehmetnuri.springveritabani.services.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseController<T, S extends BaseService> {

    @Autowired
    S service;


    @GetMapping(path = "/findAll")
    public List<T> findAll() {
        return service.findAll();
    }

    @PostMapping(path = "/save", consumes = "application/json")
    public T save(@RequestBody T entity) {
        return (T) service.save(entity);
    }

    @DeleteMapping(path = "/delete/{entityId}")
    public void delete(@PathVariable Long entityId) {
        service.delete(entityId);
    }
}
