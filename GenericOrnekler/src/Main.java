import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Generics Örnekler
         *
         * T - Type
         * E - Element
         * K - Key
         * N - Number
         * V - Value
         */

        /**
         *
         *
         * Interfacelerde kullanımı
         *
         * public interface  Comparable<T>{
         *
         *  public int compareTo(T object)
         * }
         *
         * // Sınıflarda Kullanımı
         * public class Printer<T>{
         *
         *  public yazdir(T object){
         *      System.out.println(object)
         *  }
         *
         * }
         *
         *Method ile kullanım - 1
         * public <T > T myGenericMethod() {
         *T object = null;
         *     //***
         *return object;
         *}
         * // Method ile kullanım -2
         *public <T > T myGenericMethodWithParameter(T object) {
         *return object;
         *}
         * // Method ile kullanım -3
         *public <T > void myGenericVoidMethod (T object){
         *System.out.println(object);
         *}
         *Generics Avantajla
         *
         */

        /**
        Sozluk<String, String> tren = new Sozluk<>();

        tren.ekle("apple", "elma");

        System.out.println(tren.getir("apple"));


        Sozluk<String, Integer> maasCalisan = new Sozluk<>();
        maasCalisan.ekle("ahmet", 15000);
        maasCalisan.ekle("mehmet", 16000);

        System.out.println(maasCalisan.getir("ahmet"));

         */

        /**
        GenericMetotveSiniflar<String> stringTest = new GenericMetotveSiniflar<>();

        stringTest.yaz("Parametrem");
        System.out.println((String) stringTest.degerDondur());
        String parametreli_deger = stringTest.parametreliDonduren("Parametreli değer döndür");
        System.out.println(parametreli_deger);
        stringTest.parametreliDondurmeyen("Parametreli Döndürmeyen");
         **/

//        GenericClass<Long> genericClass = new GenericClass<Long>();

        /**
        GenericTipim stringTipim = new GenericTipim();
        stringTipim.setT("String");
        stringTipim.setT(10); // Autoboxing

        System.out.println(stringTipim.getT());

        GeneticMetot kontrol = new GeneticMetot();

        String a = "Abc";
        String e = "Abc";
        String f = "Abc";
        boolean c = kontrol.adresKontrolEt(a, e);
        boolean b = kontrol.kontrolEt(a,f);

        System.out.println(b);
        System.out.println(c);
**/

        /**
         * Wildcard  tipini tahmin edemeyeceğimiz durumlarda
         *   ? işareti kullanılır
         */

/*
        List<Integer> wildcardList = new ArrayList<>();

        wildcardList.add(1);
        wildcardList.add(2);

        kontrol.printList(wildcardList);

        List<String> wildcardList2 = new ArrayList<>();
        wildcardList2.add("Ahmet");
        wildcardList2.add("Mehmet");

        kontrol.printList(wildcardList2);

        kontrol.printNumberList(wildcardList);

        List<Number> wildcardList3 = new ArrayList<>();

        wildcardList3.add(1);
        wildcardList3.add(2);

        kontrol.printNuberListLower(wildcardList3);
        */


        Muhendis ahmet = new Muhendis();
        ahmet.setAd("Ahmet");
        ahmet.setSoyadi("Duran");
        ahmet.setTc("1234");
        ahmet.setPrim(12000.05D);
        ahmet.setTatilVarmi(true);
        ahmet.setArabaVarmi(false);

        CalisanIslem<Muhendis> muhendisOperasyon = new CalisanIslem<>();

        muhendisOperasyon.listeyeElemanEkle(ahmet);
        muhendisOperasyon.listeyeElemanEkle(ahmet);
        muhendisOperasyon.listeyiBas();
        muhendisOperasyon.listeyiBasI();

        Isci ali = new Isci();
        ali.setAd("Ali");
        ali.setSoyadi("Kalkan");
        ali.setTc("879");
        ali.setEyt(false);
        ali.setSodexo(10000D);
        ali.setCocukYardimi(true);

        CalisanIslem<Isci> isciOperasyon = new CalisanIslem<>();
        isciOperasyon.listeyeElemanEkle(ali);
        isciOperasyon.listedenElemanCikarI(ali);
        isciOperasyon.listeyiBas();
        isciOperasyon.listeyiBasI();

    }
}