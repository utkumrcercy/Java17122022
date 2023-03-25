package com.mehmetnuri.springmongodbornek2.service;

import com.mehmetnuri.springmongodbornek2.document.Certificate;
import com.mehmetnuri.springmongodbornek2.repository.CertificateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateService {

    private final CertificateRepository certificateRepository;

    public CertificateService(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    public List<Certificate> findAllCertificates() {
        return certificateRepository.findAll();
    }

    public Certificate findCertificateById(String id) {
        return certificateRepository.findById(id).orElse(null);
    }

    public Certificate saveCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    public void deleteCertificate(String id) {
        certificateRepository.deleteById(id);
    }

    public Certificate updateCertificate(String id, Certificate certificate) {
        Certificate certificateDb = certificateRepository.findById(id).orElse(null);
        if (certificateDb != null) {
            certificateDb.setTitle(certificate.getTitle());
            return certificateRepository.save(certificateDb);
        } else {
            return null;
        }

    }
}
