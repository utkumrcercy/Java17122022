package com.mehmetnuri.restapigiris.controllers;

import com.mehmetnuri.restapigiris.commons.controller.BaseController;
import com.mehmetnuri.restapigiris.domain.Bolum;
import com.mehmetnuri.restapigiris.dto.BolumDto;
import com.mehmetnuri.restapigiris.services.BolumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/bolum")
public class BolumController extends BaseController<Bolum, BolumService> {

    @Autowired
    BolumService service;


    @GetMapping("/ozelBul/{id}")
    public BolumDto ozelBul(@PathVariable Long id) {
        return this.service.findByIdCustom(id);
    }
}
