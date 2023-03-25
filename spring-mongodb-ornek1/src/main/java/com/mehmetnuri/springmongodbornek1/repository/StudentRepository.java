package com.mehmetnuri.springmongodbornek1.repository;

import com.mehmetnuri.springmongodbornek1.document.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
}
