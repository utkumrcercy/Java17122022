public class Ogrenci {

    String ad;
    String soyad;
    Long ogrenciNo;
    String fakulte;
    String bolum;
    Long sinif;
    Boolean burs;


    public void oku() {
        System.out.println("Okuyabilir");
    }

    @Override
    public String toString() {
        return "AD: " + ad + "\nSOYAD: " + soyad;
    }
}
