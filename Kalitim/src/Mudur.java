public class Mudur extends Calisan{

    private Boolean ozelSigorta;


    public Mudur() {
        super(); // Üst sınıfın kurucu metodu
    }

    public Boolean getOzelSigorta() {
        return ozelSigorta;
    }

    public void setOzelSigorta(Boolean ozelSigorta) {
        this.ozelSigorta = ozelSigorta;
    }

    @Override
    public String toString() {
        return "Mudur{" +
                "tc=" + super.getTc() +
                "ad=" + super.getAd() +
                "soyad=" + super.getSoyad() +
                "ozelSigorta=" + ozelSigorta +
                '}';
    }
}
