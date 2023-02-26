package com.mehmetnuri.enums;

public enum EnumDurumAP {
    AKTIF("Aktif"),
    PASIF("Pasif");

    private final String durumu;

    EnumDurumAP(String durumu) {
        this.durumu = durumu;
    }

    public String getDurumu() {
        return durumu;
    }
}
