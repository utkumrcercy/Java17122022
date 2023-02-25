package com.mehmetnuri.dao;

import com.mehmetnuri.entity.Kurs;

import java.util.List;

public interface KursDao {

    public Kurs saveKurs(Kurs kurs);

    public List<Kurs> listAllKurs();

    public Boolean deleteKursByKursId(Long kursId);

    public Boolean deleteAllKurs();

    public Kurs updateKursByKursId(Kurs kurs, Long kursId);

    public Kurs findKursById(Long id);
}
