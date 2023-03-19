package com.mehmetnuri.springrediscacheexample.repository;

import com.mehmetnuri.springrediscacheexample.entity.MamaKabi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MamaKabiRepository extends JpaRepository<MamaKabi, Long> {
}
