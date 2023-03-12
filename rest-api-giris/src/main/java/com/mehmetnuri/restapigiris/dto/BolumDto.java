package com.mehmetnuri.restapigiris.dto;

import com.mehmetnuri.restapigiris.domain.Fakulte;

public class BolumDto {

    private Long id;
    private String ad;
    private String durum;

    private Fakulte fakulte;


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

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    public Fakulte getFakulte() {
        return fakulte;
    }

    public void setFakulte(Fakulte fakulte) {
        this.fakulte = fakulte;
    }
}
