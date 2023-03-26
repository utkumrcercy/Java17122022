package com.mehmetnuri.springwebmvcornek.repositories;

import com.mehmetnuri.springwebmvcornek.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
