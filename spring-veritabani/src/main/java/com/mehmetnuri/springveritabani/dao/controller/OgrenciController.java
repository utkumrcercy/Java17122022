package com.mehmetnuri.springveritabani.dao.controller;

import com.mehmetnuri.springveritabani.domain.Ogrenci;
import com.mehmetnuri.springveritabani.dto.OgrenciDto;
import com.mehmetnuri.springveritabani.services.OgrenciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ogrenci")
public class OgrenciController extends BaseController<Ogrenci, OgrenciService> {

    @Autowired
    OgrenciService ogrenciService;

    @GetMapping(path = "/ogrencino/{ogrenciNo}")
    public OgrenciDto findOgrenciByOgrenciNo(@PathVariable Long ogrenciNo) {
        return this.ogrenciService.findOgrenciByOgrenciNo(ogrenciNo);
    }
}
