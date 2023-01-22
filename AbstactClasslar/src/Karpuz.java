public class Karpuz extends Meyve{

    private String renk;

    private Double fiyat;

    @Override
    public String meyveAdi() {
        return this.adGetir();
    }

    @Override
    public String toString() {
        return "Karpuz{" +
                "ad='" + this.adGetir() + '\'' +
                "renk='" + renk + '\'' +
                ", fiyat=" + fiyat +
                '}';
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
}
