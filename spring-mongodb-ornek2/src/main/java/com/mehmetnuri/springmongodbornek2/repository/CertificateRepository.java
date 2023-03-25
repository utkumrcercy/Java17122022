package com.mehmetnuri.springmongodbornek2.repository;

import com.mehmetnuri.springmongodbornek2.document.Certificate;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificateRepository extends MongoRepository<Certificate, String> {

}
