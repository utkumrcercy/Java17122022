public class Telefon {

    private String marka;
    private String model;
    private Double fiyat;

    @Override
    public String toString() {
        return this.marka.toString() + " => " + this.model.toString();
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
}
