package com.mehmetnuri.admin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/tanimlamalar")
public class TanimlamalarController {

    @RequestMapping(path = "/fakulte/ekle", method = RequestMethod.GET)
    public String fakulteEkle() {
        return "pages/tanimlamalar/fakulte_ekle";
    }

    @RequestMapping(path = "/okul/ekle", method = RequestMethod.GET)
    public String okulEkle() {
        return "pages/tanimlamalar/okul_ekle";
    }

    @RequestMapping(path = "/sinif/ekle", method = RequestMethod.GET)
    public String sinifEkle() {
        return "pages/tanimlamalar/sinif_ekle";
    }

    @RequestMapping(path = "/bolum/ekle", method = RequestMethod.GET)
    public String bolumEkle() {
        return "pages/tanimlamalar/bolum_ekle";
    }
}
