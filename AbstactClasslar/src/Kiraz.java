public class Kiraz extends Meyve{

    private String renk;
    private Double fiyat;

    @Override
    public String meyveAdi() {
        return this.adGetir();
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Kiraz{" +
                "ad='" + this.adGetir() + '\'' +
                "renk='" + renk + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}
