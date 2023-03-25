package com.mehmetnuri.springmongodbornek2.repository;

import com.mehmetnuri.springmongodbornek2.document.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
