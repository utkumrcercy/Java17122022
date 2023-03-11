package com.mehmetnuri.springveritabani.domain;

import javax.persistence.*;

@Entity
@Table(name = "ogrenciler")
public class Ogrenci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;

    private String  soyad;

    private Long ogrenciNo;

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

    public Long getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(Long ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }
}
