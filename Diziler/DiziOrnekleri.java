public class DiziOrnekleri {

    public static void main(String[] args) {

        int[] sayilar = new int[]{3, 6, 9, 4, 57, 68, 12, 35, 78, 63};

        // Dizideki Tek Sayıları Yazdırın
        for (int i : sayilar) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //Dizideki Çift Sayıları Yazdırın
        for (int i : sayilar) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Object => Ter Tür

        Object karisik[] = new Object[]{"Ali", 12, 13l, 'C', false, 12.02d, 13.003f};

        for (Object eleman : karisik) {
            System.out.println(eleman);
        }

        for (int i = 0; i < karisik.length; i++) {
            System.out.println(karisik[i]);
        }

        /**
         * Dizi Kopyalama
         * System.arraycopy => kopyalama metodu
         */


        //1. Yöntem
        Object karisik2[] = new Object[karisik.length]; // karisik uzunlugu kadar

        for (int i = 0; i < karisik.length; i++) {
            karisik2[i] = karisik[i];
        }

        for (Object o : karisik2) {
            System.out.println(o);
        }

        //2. Yöntem
        Object karisik3[] = new Object[karisik.length];
        // kopyalanacak dizi, kaçıncı indisten başlayarak eklenecek, aralık ne olacak(0,6)
        System.arraycopy(karisik, 0, karisik3, 0, karisik.length);

        for (Object o : karisik3) {
            System.out.println(o);
        }


    }
}
