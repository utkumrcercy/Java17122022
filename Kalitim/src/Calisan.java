public class Calisan {

    private Long tc;
    private String ad;
    private String soyad;

    public Calisan() {
        System.out.println("Ben çalışan sınıfının kurucu metoduyum");
    }

    public Long getTc() {
        return tc;
    }

    public void setTc(Long tc) {
        this.tc = tc;
    }

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


}
