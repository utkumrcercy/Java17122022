public class SamsungPhoneManager extends BasePhoneManager {

    SamsungPhoneManager(String model) {
        setMarka("Samsung");
        super.setModel(model);
    }


    @Override
    public Double satinAl(Long fiyat, Double otv) {
        Double toplamVergi = ((fiyat * 0.18) + (fiyat * 0.10) + (fiyat * otv));
        return toplamVergi + fiyat;
    }
}
