package com.mehmetnuri.restapigiris.enums;

public enum EnumOgrenciDurum {
    DEVAMLI_OGRENCI("Devamlı Öğrenci"),
    DONDURULMUS("Dondurulmuş"),
    KAYDI_SILINMIS("Kaydı Silinmiş"),
    MEZUN("Mezun");

    private final String ogrenciDurumu;

    EnumOgrenciDurum(String ogrenciDurumu) {
        this.ogrenciDurumu = ogrenciDurumu;
    }

    public String getOgrenciDurumu() {
        return ogrenciDurumu;
    }
}
