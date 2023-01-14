public class Araba {

    /**
     * Encapsulation
     */
    private String renk;
    private String marka;
    private Long yili;

    private Double fiyat;

    // GET özelliğin değerini getirir

    // SET özelliğin değerini atar

    // Kurucu constructure
    public Araba() {
        System.out.println("Ben her zaman çalışırım");
    }

    public Araba(String renk, String marka, Long yili, Double fiyat) {
        this.renk = renk;
        this.marka = marka;
        this.yili = yili;
        this.fiyat = fiyat;
    }

    public Araba(String renk, String marka) {
        this.renk = renk;
        this.marka = marka;
    }

    // yıkıcı deconstructure

    @Override
    protected void finalize()  {
        System.out.println("Yıkıcı");
    }

    public Double aylikTaksit(Long taksitSayisi) {
        Islemler islem = new Islemler();

        Double sonuc = islem.bol(this.fiyat, taksitSayisi);

        return sonuc;

    }


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Long getYili() {
        return yili;
    }

    public void setYili(Long yili) {
        this.yili = yili;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "renk='" + renk + '\'' +
                ", marka='" + marka + '\'' +
                ", yili=" + yili +
                ", fiyat=" + fiyat +
                '}';
    }


}
