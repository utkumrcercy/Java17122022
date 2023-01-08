import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        /**
         *  elimizde 2 adet array var bu iki arrayin eşit
         *  olup olmadığını nasıl kontrol ederiz _? (Metot kullanın)
         */

        int sayilar[] = {1, 3, 5, 7, 9, 11, 15};
        int sayilar2[] = {1, 3, 5, 7, 9, 11, 15};
        int sayilar3[] = {2, 4, 6, 8, 10, 12};

        /**
         * equals => iki yapının birbirine eşit olup olmadığını
         * kontrol eder ve boolean değer döndürür( Adrese Göre Eşitleme Kontrol Eder)
         * a.equals(b)
         *
         * Arrays.equals(a,b) (İçeriğe göre kontrol sağlar)
         */

        System.out.println("sayilar dizisi ile sayilar2 dizisi adresleri eşit mi? " + kontrol(sayilar, sayilar2));
        System.out.println("sayilar dizisi ile sayilar2 dizisi içerikleri eşit mi? " + kontrol2(sayilar, sayilar2));
        System.out.println("sayilar dizisi ile sayilar3 dizisi içerikleri eşit mi? " + kontrol2(sayilar, sayilar3));
    }

    public static boolean kontrol(int[] array1, int[] array2) {
        if (array1.equals(array2)) {
            return true;
        }
        return false;
    }

    public static boolean kontrol2(int[] array1, int[] array2) {
        if (Arrays.equals(array1, array2)) {
            return true;
        }
        return false;
    }
}