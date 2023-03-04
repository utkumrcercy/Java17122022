package com.mehmetnuri.springthymeleafornek;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MerhabaController {

    @GetMapping(value = "/")
    public String merhabaSayfasi(Model model) {

        List<String> kullaniciListesi = new ArrayList<>();
        kullaniciListesi.add("Ali");
        kullaniciListesi.add("Veli");
        kullaniciListesi.add("Kemal");

        String kullaniciAdi = "Cansu";

        Boolean girisDurumu = Boolean.TRUE;
        String mesaj = "Ben Java'dan geldim";

        model.addAttribute("girisDurumu", girisDurumu);
        model.addAttribute("mesaj", mesaj);
        model.addAttribute("kullanicilar", kullaniciListesi);
        model.addAttribute("kullaniciAdi", kullaniciAdi);

        return "merhaba"; //merhaba.html
    }

    @GetMapping(value = "/hakkimda")
    public String hakkimdaSayfasi() {

        return "hakkimda";
    }
}
