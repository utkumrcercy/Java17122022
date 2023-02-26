package com.mehmetnuri.entity;

import javax.persistence.*;

@Entity
@Table(name = "kisiler")
public class Kisiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;
    private String soyad;
    private String numara;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_telefon")
    private Telefon telefon;

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

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public Telefon getTelefon() {
        return telefon;
    }

    public void setTelefon(Telefon telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Kisiler{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", numara='" + numara + '\'' +
                ", telefon=" + telefon +
                '}';
    }
}
