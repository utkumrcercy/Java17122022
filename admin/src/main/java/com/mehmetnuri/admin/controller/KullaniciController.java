package com.mehmetnuri.admin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/kullanicilar")
public class KullaniciController {

    @RequestMapping(path = "/listele", method = RequestMethod.GET)
    public String getAllUsers() {
        return "pages/kullanici/listele";
    }

    @RequestMapping(path = "/ekle", method = RequestMethod.GET)
    public String kullaniciEkle() {
        return "pages/kullanici/ekle";
    }

    @RequestMapping(path = "/guncelle", method = RequestMethod.GET)
    public String kullaniciGuncelle() {
        return "pages/kullanici/guncelle";
    }
}
