public class Main {
    public static void main(String[] args) {

        /**
         * Metotlar (Fonksiyonlar-Yordamlar)
         *
         * erişim belirleyisi dönüş tipi metodAdi(varsa parametre){
         *
         * }
         *
         */

        selamla();
        islemYap();
        isimYaz("Mehmet"); // 1 parametre

        bilgiYaz("Mehmet Nuri",
                "Öztürk",
                1993,
                123,
                "Meslek",
                32.00d); //çoklu parametre

    }

    /**
     * Değer döndürmeyen ve parametre almayan metot
     */
    public static void selamla() {
        System.out.println("Merhaba Java !");
    }

    public static void islemYap() {
        System.out.println("Bölme: " + (10 / 2));
        System.out.println("Çarpma: " + (10 * 2));
    }

    /**
     * Değer döndürmeyen parametre alan metod
     */

    public static void isimYaz(String ad) {
        System.out.println("Merhaba : " + ad);
    }

    public static void bilgiYaz(String ad, String soyad,
                                int dogumYili, int tc,
                                String meslek, double maas) {

        System.out.println("Ad :" + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("Doğum Yılı: " + dogumYili);
        System.out.println("TC: " + tc);
        System.out.println("Meslek: " + meslek);
        System.out.println("Maaş: " + maas);

    }
}