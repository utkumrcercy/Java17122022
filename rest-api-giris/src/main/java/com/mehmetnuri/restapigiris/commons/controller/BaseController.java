package com.mehmetnuri.restapigiris.commons.controller;

import com.mehmetnuri.restapigiris.commons.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class BaseController<T, S extends BaseService> {

    @Autowired
    S service;

    @GetMapping(path = "/findAll")
    public List<T> findAll() {
        return this.service.findAll();
    }

    @GetMapping(path = "/findById/{id}")
    public T findById(@PathVariable Long id) {
        return (T) this.service.findById(id);
    }

    @PostMapping(path = "/save", consumes = "application/json")
    public T save(@RequestBody T entity) {
        return (T) this.service.save(entity);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void delete(@PathVariable Long id) {
        this.service.deleteById(id);
    }
}
