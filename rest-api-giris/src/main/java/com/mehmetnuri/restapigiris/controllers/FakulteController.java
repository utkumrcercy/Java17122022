package com.mehmetnuri.restapigiris.controllers;

import com.mehmetnuri.restapigiris.commons.controller.BaseController;
import com.mehmetnuri.restapigiris.domain.Fakulte;
import com.mehmetnuri.restapigiris.services.FakulteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/fakulte")
public class FakulteController extends BaseController<Fakulte, FakulteService> {
}
