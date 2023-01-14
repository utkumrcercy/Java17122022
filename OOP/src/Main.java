import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /**
         * Sınıf Tanımlama
         *  Dosya olarak tanımlanmalıdır
         *
         *  erişim belirleyici (public private protected default) SınıfAdı {
         *
         *      yazılmak istenen kod
         *
         *
         *  }
         *
         *
         */

        /** Örnek alma (Instance)
         *  SınıfAdı  adi = new SınıfAdı();
         */

/**
 Islemler islemler = new Islemler();

 int topla = islemler.topla(2, 3);
 int cikar = islemler.cikarma(2, 3);
 int carp = islemler.carp(2, 3);
 int bol = islemler.bol(2, 3);

 System.out.println(topla);
 System.out.println(cikar);
 System.out.println(carp);
 System.out.println(bol);


 Islemler armut = new Islemler();

 System.out.println(armut.cikarma(10,2));
 */

/**
        Ogrenci ahmet = new Ogrenci();
        ahmet.ad = "Ahmet";
        ahmet.soyad = "Turan";
        ahmet.fakulte = "Mühendislik";
        ahmet.sinif = 1L;
        ahmet.bolum = "Yazılım Mühendisliği";
        ahmet.burs = Boolean.TRUE;
        ahmet.ogrenciNo = 1453L;

        ahmet.oku();
        System.out.println(ahmet);

    }

 */

/*
        Araba volvo = new Araba();
        volvo.setMarka("Volvo");
        volvo.setRenk("Kırmızı");
        volvo.setYili(2018L);
        volvo.setFiyat(700536.02D);
        System.out.println(volvo);

        Double aylikTaksit = volvo.aylikTaksit(10L);
        System.out.println(aylikTaksit);

        Araba ford = new Araba("Mavi", "Ford",2023L,800000.00D);
        System.out.println(ford);
        System.out.println(ford.aylikTaksit(12L));


        Araba tofas = new Araba("Beyaz", "Tofas");
        tofas.setYili(1995L);
        tofas.setFiyat(50000.00D);
        System.out.println(tofas);
        System.out.println(tofas.aylikTaksit(36L));
        */

        /**

        BuzDolabi arcelik = new BuzDolabi();
        arcelik.setMarka("Arçelik");
        arcelik.setModel("AX123");
        arcelik.setKapasite(100L);
        arcelik.setBuzlukAltta(Boolean.TRUE);
        arcelik.setKapiSayisi(4L);
        arcelik.setEnerjiSinifi("A+++++");
        arcelik.setUretimYili(2023L);

        System.out.println(arcelik);

        BuzDolabi bosh = new BuzDolabi("Bosh", 2023L,"CX123", 2L, 20L,Boolean.FALSE, "B++" );
        System.out.println(bosh);

         */


        /**

        Scanner scanner = new Scanner(System.in);

        BuzDolabi kullanici = new BuzDolabi();

        System.out.printf("Buz dolabı marka : ");
        kullanici.setMarka(scanner.nextLine());

        System.out.printf("Buz dolabı model : ");
        kullanici.setModel(scanner.nextLine());


        System.out.printf("Buz dolabı buzluk altta mı ? : ");
        String alttaMi = scanner.nextLine();

        if (alttaMi == "Evet") {
            kullanici.setBuzlukAltta(Boolean.TRUE);
        } else {
            kullanici.setBuzlukAltta(Boolean.FALSE);
        }

        System.out.printf("Buz dolabı enerji sınıfı: ");
        kullanici.setEnerjiSinifi(scanner.nextLine());


        System.out.printf("Buz dolabı kapı sayısı : ");
        kullanici.setKapiSayisi(scanner.nextLong());

        System.out.printf("Buz dolabı kapasite : ");
        kullanici.setKapasite(scanner.nextLong());

        System.out.printf("Buz dolabı üretim yılı: ");
        kullanici.setUretimYili(scanner.nextLong());

        System.out.println(kullanici);

         */

        Phone iphone = new Phone();

        iphone.setMarka("Apple");
        iphone.setModel("14 pro max");
        iphone.setBesG(Boolean.TRUE);
        iphone.setKamera(Boolean.TRUE);
        iphone.setFiyat(57000.00D);
        iphone.setRenk("Uzay Grisi");
        iphone.setKapasite(1024L);
        iphone.setBataryaKapasitesi(5000L);
        iphone.setIslemciCekirdekSayisi(8L);

        System.out.println(iphone);
        System.out.println(iphone.taksit(36L));
        System.out.println(iphone.faizHesapla(24L, 1.5));


    }
}