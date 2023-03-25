package com.mehmetnuri.springmongodbornek1.repository;

import com.mehmetnuri.springmongodbornek1.document.Category;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends MongoRepository<Category, Long> {
}
