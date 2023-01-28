public class Main {
    public static void main(String[] args) {

        /**
         * Generics
         */

        ListManager<Integer> ogrenciNoList = new ListManager<>();
        ogrenciNoList.addList(2);

        System.out.println(ogrenciNoList.getList());

        Ogrenci ali = new Ogrenci();
        ali.setNo(1L);
        ali.setAd("Ali");


        Ogrenci veli = new Ogrenci();
        veli.setNo(1L);
        veli.setAd("Ali");

        ListManager<Ogrenci> ogrenciList = new ListManager<>();

        ogrenciList.addList(ali);
        ogrenciList.addList(veli);

        System.out.println(ogrenciList.getList());


        EmployeManager<Integer> musteriSistemi = new EmployeManager<>();
        musteriSistemi.isim = "ALi";
        musteriSistemi.soyisim = "VELİBABA";
        musteriSistemi.maas = 150000;
        System.out.println(musteriSistemi.getKayitNo());
        System.out.println(musteriSistemi.maas);


        EmployeManager<Double> muhendis = new EmployeManager<>();
        muhendis.isim = "Abubakar";
        muhendis.soyisim = "Dembababababa";
        muhendis.maas = 156014.02D;
        System.out.println(muhendis.getKayitNo());
        System.out.println(muhendis.maas);

        AlanHesapla<Integer> alanHesapla = new AlanHesapla<>();

        Double aDouble = alanHesapla.alanHesapla(23);
        System.out.println(aDouble);

    }
}