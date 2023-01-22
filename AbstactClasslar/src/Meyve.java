public abstract class Meyve {

    private String ad;

    public void adBelirt(String ad) {
        this.ad = ad;
    }

    public String adGetir() {
        return this.ad;
    }

    public abstract String meyveAdi();

}
