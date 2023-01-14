public class Phone {

    private String marka;
    private String model;
    private String renk;
    private Long islemciCekirdekSayisi;
    private Boolean kamera;
    private Long kapasite;
    private Long bataryaKapasitesi;
    private Boolean besG;
    private Double fiyat;

    public Phone() {
    }

    public Phone(String marka, String model, String renk, Long islemciCekirdekSayisi, Boolean kamera, Long kapasite,
                 Long bataryaKapasitesi, Boolean besG, Double fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.islemciCekirdekSayisi = islemciCekirdekSayisi;
        this.kamera = kamera;
        this.kapasite = kapasite;
        this.bataryaKapasitesi = bataryaKapasitesi;
        this.besG = besG;
        this.fiyat = fiyat;
    }

    public Double taksit(Long taksitSayisi) {

        Islemler islemler = new Islemler();

        return islemler.bol(this.fiyat, taksitSayisi);

    }

    public Double faizHesapla(Long ay, Double faizOrani) {

        /**
         * (Anapara / 100) * (Faiz Oranı / 365) * Gün Sayısı = Günlük Faiz Getirisi
         * (Anapara / 100) * (Faiz Oranı / 12) * Ay Sayısı = Aylık Faiz Getirisi
         * (Anapara / 100) * (Faiz Oranı) * Yıl Sayısı = Yıllık Faiz Getirisi
         *
         */

        Double aylikGetiri = (this.fiyat /100) * (faizOrani / 12) * ay;
        return this.fiyat - aylikGetiri;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", islemciCekirdekSayisi=" + islemciCekirdekSayisi +
                ", kamera=" + kamera +
                ", kapasite=" + kapasite +
                ", bataryaKapasitesi=" + bataryaKapasitesi +
                ", besG=" + besG +
                ", fiyat=" + fiyat +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public Long getIslemciCekirdekSayisi() {
        return islemciCekirdekSayisi;
    }

    public void setIslemciCekirdekSayisi(Long islemciCekirdekSayisi) {
        this.islemciCekirdekSayisi = islemciCekirdekSayisi;
    }

    public Boolean getKamera() {
        return kamera;
    }

    public void setKamera(Boolean kamera) {
        this.kamera = kamera;
    }

    public Long getKapasite() {
        return kapasite;
    }

    public void setKapasite(Long kapasite) {
        this.kapasite = kapasite;
    }

    public Long getBataryaKapasitesi() {
        return bataryaKapasitesi;
    }

    public void setBataryaKapasitesi(Long bataryaKapasitesi) {
        this.bataryaKapasitesi = bataryaKapasitesi;
    }

    public Boolean getBesG() {
        return besG;
    }

    public void setBesG(Boolean besG) {
        this.besG = besG;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }
}
