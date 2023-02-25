package com.mehmetnuri.entity;

import javax.persistence.*;

@Entity
@Table(name = "kurslar")
public class Kurs {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "kurs_adi")
    private String kursAdi;

    @Column(name = "egitmen")
    private String egitmen;

    @Column(name = "kurs_saati")
    private Long kursSaati;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKursAdi() {
        return kursAdi;
    }

    public void setKursAdi(String kursAdi) {
        this.kursAdi = kursAdi;
    }

    public String getEgitmen() {
        return egitmen;
    }

    public void setEgitmen(String egitmen) {
        this.egitmen = egitmen;
    }

    public Long getKursSaati() {
        return kursSaati;
    }

    public void setKursSaati(Long kursSaati) {
        this.kursSaati = kursSaati;
    }
}
