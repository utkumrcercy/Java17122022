public class Main {
    public static void main(String[] args) {

        /** Diziler (Arrays)
         *
         * Üzerinde birden fazla veri barındıran yapılar
         *
         *  veritipi[]  dizi_adi = new veritipi[eleman_sayisi];
         *
         *  veritipi dizi_adi[eleman_sayisi];
         *
         */

        int[] sayilar = new int[7];

        sayilar[0] = 1; // Diziye eleman ekleme
        sayilar[1] = 3;
        sayilar[2] = 4;
        sayilar[3] = 12;
        sayilar[4] = 9;
        sayilar[5] = 7;
        sayilar[6] = 3;

        // Elemana ulaşma
        System.out.println(sayilar[0]);

        // Dizinin uzunluğunu bulma
        System.out.println(sayilar.length);

        for (int i = 0; i < sayilar.length; i++) {
            System.out.println(sayilar[i]);
        }

        // Değer atayarak
        int dizi[] = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
        }

        String isimler[] = {"Ahmet", "Mehmet", "Kemal"};
        for (int i = 0; i < isimler.length; i++) {
            System.out.println(isimler[i]);
        }


        int sayiDizisi[] = new int[10];

        sayiDizisi = new int[]{1,2,3,4,5,6,7,8};

        for (int i = 0; i < sayiDizisi.length; i++) {
            System.out.println(sayiDizisi[i]);
        }

    }
}