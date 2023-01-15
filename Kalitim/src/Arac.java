public class Arac implements IArac{

    private String marka;
    private String model;
    private Double fiyat;
    private String renk;


    public void bilgiVer() {
        System.out.println("Marka: " + this.marka + " Model: " + this.model
                + " Fiyat: " + this.fiyat + " Renk: " + this.renk);
    }


    @Override
    public void ozellikYaz() {
        this.bilgiVer();

    }

    @Override
    public void markaYaz() {
        System.out.println(this.marka);
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
