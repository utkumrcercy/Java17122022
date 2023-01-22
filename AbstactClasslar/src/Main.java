public class Main {

    /**
     *
     *  Abstract (Soyut)
     *
     *  erişim beliryelici abstract  class sinifadi(){
     *
     *      public abstract metod(); => Zorunlu kılmak için
     *
     *      public metod(){ => zorunlu kılmamak için
     *
     *      }
     *  }
     */
    public static void main(String[] args) {

        /**
        Abs abs = new Abs();
        abs.absractMetod();
        abs.ekranaMerhabaYaz();

        Ogrenci ahmet = new Ogrenci();
        ahmet.setSoyad("Öztürk");
        ahmet.setNumarasi(132L);
        ahmet.setAd("Ahmet");
        System.out.println(ahmet);
*/

        /*
        Kiraz yesilYurt = new Kiraz();
        yesilYurt.setRenk("Pembe");
        yesilYurt.setFiyat(30.00D);
        yesilYurt.adBelirt("Yeşilyurt Pembe Kiraz");

        System.out.println(yesilYurt);

        Karpuz siyahKarpuz = new Karpuz();
        siyahKarpuz.adBelirt("Siyah Karpuz");
        siyahKarpuz.setRenk("Siyah");
        siyahKarpuz.setFiyat(12.00D);

        System.out.println(siyahKarpuz);*/

        SamsungPhoneManager samsungPhoneManager = new SamsungPhoneManager("S23");
        System.out.println(samsungPhoneManager.satinAl(20000L,0.60));

        ApplePhoneManager applePhoneManager = new ApplePhoneManager("4 Pro Max");
        System.out.println(applePhoneManager.satinAl(57000L, .080));

    }
}