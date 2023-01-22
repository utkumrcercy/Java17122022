public class ApplePhoneManager extends BasePhoneManager{

    ApplePhoneManager(String model) {
        this.setMarka("Apple");
        this.setModel(model);

    }

    @Override
    public Double satinAl(Long fiyat, Double otv) {
        Double toplamVergi = ((fiyat * 0.18) + (fiyat * 0.10) + (fiyat * otv));
        return (toplamVergi * 2) + fiyat;
    }
}
