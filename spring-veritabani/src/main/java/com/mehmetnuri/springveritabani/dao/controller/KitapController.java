package com.mehmetnuri.springveritabani.dao.controller;

import com.mehmetnuri.springveritabani.domain.Kitap;
import com.mehmetnuri.springveritabani.services.KitapService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/kitaplar")
public class KitapController extends BaseController<Kitap, KitapService> {

}
