package com.mehmetnuri.restapigiris.enums;

public enum EnumDurumAP {
    AKTIF("Aktif"),
    PASIF("Pasif");

    private final   String durum;


    EnumDurumAP(String durum) {
        this.durum = durum;
    }

    public String getDurum() {
        return durum;
    }
}
