import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Ana sınıfa super class
         * Miras alan sınıfa  sub class denir
         *
         * super anahtar kelimesi ile üst sınıftaki
         * field ve metotlara erişebiliriz
         * super üst sınıfı temsil eder
         *
         *  class UstSinif(){
         *  }
         *
         * class AltSinif  extends UstSinif(){
         *
         * }
         *
         */

        /**

        Mudur ahmet = new Mudur();
        ahmet.setTc(123L);
        ahmet.setAd("Ahmet");
        ahmet.setSoyad("Özel");
        ahmet.setOzelSigorta(Boolean.TRUE);

        System.out.println(ahmet);

        Muhendis ali = new Muhendis();
        ali.setTc(123L);
        ali.setAd("ALi");
        ali.setSoyad("Özel");
        ali.setPrim(1230D);
        System.out.println(ali);
         */

        /**
        KrediTurleri ihtiyac = new KrediTurleri();
        ihtiyac.setKrediTutari(10000D);
        ihtiyac.setTaksitSayisi(6L);
        ihtiyac.setFaizOrani(0.1D);
        System.out.println(ihtiyac.odenecekTutar());

        TarimKredisi tarim = new TarimKredisi();
        tarim.setKrediTutari(10000D);
        tarim.setTaksitSayisi(12L);
        tarim.setFaizOrani(0.6D);
        System.out.println(tarim.odenecekTutar());

         */

/**
        Arac arac = new Arac();
        arac.setMarka("Volvo");
        arac.setModel("v40");
        arac.setRenk("Kırmızı");
        arac.setFiyat(700000.00D);

        arac.markaYaz();
        arac.ozellikYaz();

        Kamyon kamyon = new Kamyon();
        kamyon.setMarka("Ford");
        kamyon.setModel("XCA");
        kamyon.setRenk("Beyaz");
        kamyon.setFiyat(1000000.00D);
        kamyon.setDepoSayisi(2L);

        kamyon.markaYaz();
        kamyon.ozellikYaz();
        kamyon.depoSayisiYaz();

 */

        DatabaseManager databaseManager;

        int karar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\n----------------INTERFACE KULLANIMI----------------");

        System.out.print("[1] PostgreSQL  Bağlan\n[2] Oracle Bağlan\n\nKararınız: ");

        karar = scanner.nextInt();

        switch (karar) {
            case 1:
                databaseManager = new DatabaseManager(new PostgreSQLDB());
                System.out.println("-----------------------");
                databaseManager.loginDataBase();
                System.out.println("-----------------------");
                databaseManager.selectMenu();
                break;
            case 2:
                databaseManager = new DatabaseManager(new OraleDB());
                System.out.println("-----------------------");
                databaseManager.loginDataBase();
                System.out.println("-----------------------");
                databaseManager.selectMenu();
                break;
            default:
                System.out.println("Hatalı Seçim !");
                break;

        }
    }
}