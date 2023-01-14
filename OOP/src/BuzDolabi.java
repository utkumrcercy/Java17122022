public class BuzDolabi {

    private String marka;
    private Long uretimYili;
    private String model;
    private Long kapiSayisi;
    private Long kapasite;
    private Boolean buzlukAltta;
    private String enerjiSinifi;

    public BuzDolabi() {
    }

    public BuzDolabi(String marka, Long uretimYili, String model, Long kapiSayisi, Long kapasite, Boolean buzlukAltta,
                     String enerjiSinifi) {
        this.marka = marka;
        this.uretimYili = uretimYili;
        this.model = model;
        this.kapiSayisi = kapiSayisi;
        this.kapasite = kapasite;
        this.buzlukAltta = buzlukAltta;
        this.enerjiSinifi = enerjiSinifi;
    }

    @Override
    public String toString() {
        return "BuzDolabi{" +
                "marka='" + marka + '\'' +
                ", uretimYili=" + uretimYili +
                ", model='" + model + '\'' +
                ", kapiSayisi=" + kapiSayisi +
                ", kapasite=" + kapasite + " Litre"+
                ", buzlukAltta=" + buzlukAltta +
                ", enerjiSinifi='" + enerjiSinifi + '\'' +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public Long getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(Long uretimYili) {
        this.uretimYili = uretimYili;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(Long kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public Long getKapasite() {
        return kapasite;
    }

    public void setKapasite(Long kapasite) {
        this.kapasite = kapasite;
    }

    public Boolean getBuzlukAltta() {
        return buzlukAltta;
    }

    public void setBuzlukAltta(Boolean buzlukAltta) {
        this.buzlukAltta = buzlukAltta;
    }

    public String getEnerjiSinifi() {
        return enerjiSinifi;
    }

    public void setEnerjiSinifi(String enerjiSinifi) {
        this.enerjiSinifi = enerjiSinifi;
    }


}
