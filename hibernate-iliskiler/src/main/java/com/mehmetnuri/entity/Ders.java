package com.mehmetnuri.entity;

import com.mehmetnuri.enums.EnumDurumAP;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dersler")
public class Ders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ders_adi", length = 500, nullable = false)
    private String dersAdi;
    private Long kapasite;
    @Temporal(TemporalType.TIMESTAMP) //Tarih ve zaman bilgisini tutar
    private Date olusturulmaZamani;
    @Lob
    private Byte[] dosya;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private EnumDurumAP durum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public Long getKapasite() {
        return kapasite;
    }

    public void setKapasite(Long kapasite) {
        this.kapasite = kapasite;
    }

    public Date getOlusturulmaZamani() {
        return olusturulmaZamani;
    }

    public void setOlusturulmaZamani(Date olusturulmaZamani) {
        this.olusturulmaZamani = olusturulmaZamani;
    }

    public Byte[] getDosya() {
        return dosya;
    }

    public void setDosya(Byte[] dosya) {
        this.dosya = dosya;
    }

    public EnumDurumAP getDurum() {
        return durum;
    }

    public void setDurum(EnumDurumAP durum) {
        this.durum = durum;
    }
}
