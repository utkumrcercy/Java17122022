public class Ogrenci extends OgrenciSinifi{

    @Override
    public void setAd(String ad) {
        this.ad = ad;
    }

    @Override
    public String toString() {
        return "AD: "+ this.getAd() + "\n" +
                "SOYAD: "+ super.getSoyad();
    }
}
