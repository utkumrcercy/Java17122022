public abstract class BasePhoneManager {

    private String marka;
    private String model;

    public abstract Double satinAl(Long fiyat, Double otv);

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
}
