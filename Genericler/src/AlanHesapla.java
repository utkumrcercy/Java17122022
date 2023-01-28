public class AlanHesapla<T extends Number>{

    public Double alanHesapla(T uzunluk) {

        return uzunluk.doubleValue() * uzunluk.doubleValue();
    }
}
