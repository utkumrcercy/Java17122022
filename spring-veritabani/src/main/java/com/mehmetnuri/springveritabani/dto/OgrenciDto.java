package com.mehmetnuri.springveritabani.dto;

public class OgrenciDto {
    private String ad;
    private String soyad;
    private Long ogrenciNo;

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
