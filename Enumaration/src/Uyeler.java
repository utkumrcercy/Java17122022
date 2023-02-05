public class Uyeler {

    private String ad;
    private Roller rolu;

    private YoneticiTurleri yoneticiTuru;
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Roller getRolu() {
        return rolu;
    }

    public void setRolu(Roller rolu) {
        this.rolu = rolu;
    }

    public YoneticiTurleri getYoneticiTuru() {
        return yoneticiTuru;
    }

    public void setYoneticiTuru(YoneticiTurleri yoneticiTuru) {
        this.yoneticiTuru = yoneticiTuru;
    }

    @Override
    public String toString() {
        return "Uyeler{" +
                "ad='" + ad + '\'' +
                ", rolu=" + rolu.getRolAdi() +
                ", yoneticiTuru=" + yoneticiTuru +
                '}';
    }
}
