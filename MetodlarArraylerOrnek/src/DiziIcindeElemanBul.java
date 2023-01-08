import java.util.Scanner;

public class DiziIcindeElemanBul {

    public static void main(String[] args) {
        int[] sayiDizisi = new int[]{
                15,2030,36,4,5,98,7
        };

        /**
         * Girilen değerin dizinin içinde olup olmadığını
         * kontrol eden ve değer dönderen(boolean)
         * metodu yazınız
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int tahmin = scanner.nextInt();
        System.out.println(contains(sayiDizisi, tahmin));

    }

    public static boolean contains(int[] array, int value) {

        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }


    /**
     * ÖDEV
     * İki adet dizi tanımlayın  dizinin farkını ekrana yazın
     *
     */
}
