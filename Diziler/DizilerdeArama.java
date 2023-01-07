import java.util.Arrays;
import java.util.Scanner;

public class DizilerdeArama {

    public static void main(String[] args) {

/**
        char harfler[] = {'a', 'e', 'i', 'o', 'u'};

        char arama = 'z';

        int foundItemIndex = Arrays.binarySearch(harfler, arama);
        System.out.println(foundItemIndex);

        if (foundItemIndex < 0) {
            System.out.println("Bulunamadı");
        } else {
            System.out.println(harfler[foundItemIndex]);
        }


        int sayilar[] = {33, 99, 128, 66};

        int sayi_bul = 128;

        int bulundu = Arrays.binarySearch(sayilar, sayi_bul);

        if (bulundu < 0) {
            System.out.println("Bulunmadı");
        } else {
            System.out.println(sayilar[bulundu]);
        }

*/

/**

        int sayilar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int cevap;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen 1-10 arasında bir sayı giriniz: ");
        cevap = scanner.nextInt();

        int arama = Arrays.binarySearch(sayilar, cevap);

        if (arama < 0) {
            System.out.println("Sayı bulunamadı");
        }else{
            System.out.println(sayilar[arama]);
        }
 **/
        int sayilar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};


        int cevap = 14;
        int arama = Arrays.binarySearch(sayilar, 12,14, cevap);
        System.out.println(arama);
    }

}
