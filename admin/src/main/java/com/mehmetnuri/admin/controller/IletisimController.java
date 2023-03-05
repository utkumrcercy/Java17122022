package com.mehmetnuri.admin.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "/iletisim")
public class IletisimController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String iletisim() {
        return "pages/iletisim/iletisim";
    }

}
