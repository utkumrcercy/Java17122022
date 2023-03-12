package com.mehmetnuri.restapigiris.domain;

import com.mehmetnuri.restapigiris.enums.EnumDurumAP;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "fakulteler")
public class Fakulte implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ad;

    @Enumerated(EnumType.STRING)
    private EnumDurumAP durum;

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

    public EnumDurumAP getDurum() {
        return durum;
    }

    public void setDurum(EnumDurumAP durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return this.ad.toString();
    }
}
