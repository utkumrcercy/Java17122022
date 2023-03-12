package com.mehmetnuri.restapigiris.controllers;

import com.mehmetnuri.restapigiris.commons.controller.BaseController;
import com.mehmetnuri.restapigiris.domain.Sinif;
import com.mehmetnuri.restapigiris.services.SinifService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sinif")
public class SinifController extends BaseController<Sinif, SinifService> {
}
