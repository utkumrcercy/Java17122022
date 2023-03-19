package com.mehmetnuri.springrediscacheexample.controller;

import com.mehmetnuri.springrediscacheexample.config.CustomeResponseEntity;
import com.mehmetnuri.springrediscacheexample.entity.MamaKabi;
import com.mehmetnuri.springrediscacheexample.enums.EnumDurumAP;
import com.mehmetnuri.springrediscacheexample.enums.EnumKapTuru;
import com.mehmetnuri.springrediscacheexample.service.impl.MamaKabiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/mamakabi")
@Api(value = "MamaKabi", description = "MamaKabi API", tags = {"MamaKabi"})
public class MamaKabiV1Controller {

    private final MamaKabiService service;

    public MamaKabiV1Controller(MamaKabiService service) {
        this.service = service;
    }

    @GetMapping("/findAll")
    @ApiOperation(value = "Bütün mama kablarını getir",
            authorizations = { @Authorization(value="basicAuth") })
    public List<MamaKabi> findAll(@RequestParam(required = false) String aktif, @RequestParam(required = false) String kapTuru) {


        if (kapTuru != null && aktif != null) {

            EnumDurumAP durum = null;
            EnumKapTuru tur = null;

            if (aktif.equalsIgnoreCase("AKTIF")) {
                durum = EnumDurumAP.AKTIF;
            } else if (aktif.equalsIgnoreCase("PASIF")) {
                durum = EnumDurumAP.PASIF;
            }

            if (kapTuru.equalsIgnoreCase("MAMA")) {
                tur = EnumKapTuru.MAMA;
            } else {
                tur = EnumKapTuru.SU;
            }

            return service.findAllWithParam(durum, tur);
        } else if (aktif != null && aktif.equalsIgnoreCase("AKTIF")) {
            return service.findAllAktif();
        }

        return service.findAll();
    }

    @PostMapping("/add")
    @ApiOperation(value = "Mama kabı ekler",
            authorizations = { @Authorization(value="basicAuth") })
    public MamaKabi add(@RequestBody MamaKabi mamaKabi) {
        return service.add(mamaKabi);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value = "Mama kabı siler",
            authorizations = { @Authorization(value="basicAuth") })
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping("/find/{id}")
    @ApiOperation(value = "Id ye göre mama kabı getirir",
            authorizations = { @Authorization(value="basicAuth") })
    public MamaKabi findById(@PathVariable Long id) {
        return service.findById(id);
    }
}
