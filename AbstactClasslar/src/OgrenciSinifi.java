public abstract class OgrenciSinifi {

    public String ad;
    private String soyad;
    private Long numarasi;


    public String getAd() {
        return ad;
    }

    public abstract void setAd(String ad);

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Long getNumarasi() {
        return numarasi;
    }

    public void setNumarasi(Long numarasi) {
        this.numarasi = numarasi;
    }
}
