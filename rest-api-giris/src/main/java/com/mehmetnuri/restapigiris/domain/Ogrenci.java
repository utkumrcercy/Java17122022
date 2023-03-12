package com.mehmetnuri.restapigiris.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mehmetnuri.restapigiris.enums.EnumOgrenciDurum;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ogrenciler")
public class Ogrenci implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;

    private String soyad;

    private String tc;

    @Enumerated(EnumType.STRING)
    private EnumOgrenciDurum durum;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_sinif")
    private Sinif sinif;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public EnumOgrenciDurum getDurum() {
        return durum;
    }

    public void setDurum(EnumOgrenciDurum durum) {
        this.durum = durum;
    }

    public Sinif getSinif() {
        return sinif;
    }

    public void setSinif(Sinif sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return this.ad.toString() + " " + this.soyad.toString();
    }
}
