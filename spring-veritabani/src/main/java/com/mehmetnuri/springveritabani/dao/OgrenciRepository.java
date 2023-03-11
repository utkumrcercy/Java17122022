package com.mehmetnuri.springveritabani.dao;

import com.mehmetnuri.springveritabani.dao.BaseRepository;
import com.mehmetnuri.springveritabani.domain.Ogrenci;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OgrenciRepository extends BaseRepository<Ogrenci> {


    @Query("select  ogrenci from Ogrenci  ogrenci where ogrenci.ogrenciNo = :ogrenciNo")
    Optional<Ogrenci> findOgrenciByOgrenciNo(@Param("ogrenciNo") Long ogrenciNo);

}
