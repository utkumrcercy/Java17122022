package com.mehmetnuri.restapigiris.controllers;

import com.mehmetnuri.restapigiris.commons.controller.BaseController;
import com.mehmetnuri.restapigiris.domain.Ogrenci;
import com.mehmetnuri.restapigiris.services.OgrenciService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/ogrenci")
public class OgrenciController extends BaseController<Ogrenci, OgrenciService> {
}
