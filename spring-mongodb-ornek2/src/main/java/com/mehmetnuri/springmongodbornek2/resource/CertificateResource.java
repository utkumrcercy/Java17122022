package com.mehmetnuri.springmongodbornek2.resource;

import com.mehmetnuri.springmongodbornek2.document.Certificate;
import com.mehmetnuri.springmongodbornek2.service.CertificateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/certificates")
public class CertificateResource {

    private final CertificateService service;

    public CertificateResource(CertificateService service) {
        this.service = service;
    }

    @GetMapping(path = "/all")
    public List<Certificate> findAll() {
        return this.service.findAllCertificates();
    }

    @GetMapping(path = "/{id}")
    public Certificate findById(@PathVariable String id) {
        return this.service.findCertificateById(id);
    }

    @PutMapping(path = "/update/{id}")
    public Certificate updateById(@PathVariable String id, @RequestBody Certificate certificate) {
        return this.service.updateCertificate(id, certificate);
    }

    @PostMapping(path = "/create")
    public Certificate create(@RequestBody Certificate certificate) {
        return this.service.saveCertificate(certificate);
    }

    @GetMapping(path = "/delete/{id}")
    public void deleteById(@PathVariable String id) {
        this.service.deleteCertificate(id);
    }
}
