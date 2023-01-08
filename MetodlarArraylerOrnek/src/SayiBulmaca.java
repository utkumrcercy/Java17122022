import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiBulmaca {

    public static void main(String[] args) {
        /**
         * 0-100 e kadar rastgele sayılardan oluşan
         * bir dizi oluşturun. Kullanıcıdan index numarasını isteyin
         * kullanıcıdan bu sayıyı tahmin etmesini sağlayın.
         * Metotları kullanın
         */

        piyango();

        int[] sayiDizim = generateRandomArray();

        for (int i : sayiDizim) {
            System.out.println(i);
        }
        int tahmin;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 0-99 arasında bir sayı giriniz: ");

        tahmin = scanner.nextInt();

        int sonuc = Arrays.binarySearch(sayiDizim, tahmin);

        System.out.println(sonuc);
        if (sonuc < 0) {
            System.out.println("Böyle bir sayı yok");
        } else {
            System.out.println("Tebrikler rastgele sayı içinde tahmin ettiğiniz sayı var !");
        }

    }

    private static void piyango() {
        int[] sayiDizim = generateRandomArray();

        int indexNo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 0-99 arasında bir sayı giriniz: ");
        indexNo = scanner.nextInt();

        int secilenIndex = sayiDizim[indexNo];
        System.out.println(secilenIndex);

        System.out.print("Tahmininizi giriniz: ");
        int tahmin = scanner.nextInt();

        if (secilenIndex == tahmin) {
            System.out.println("Tebrikler");
        }else{
            System.out.println("Bilemediniz sayı: " + secilenIndex);
        }
    }

    public static int[] generateRandomArray() {
        Random rd = new Random();
        int[] sayiDizisi = new int[100];
        for (int i = 0; i < sayiDizisi.length; i++) {
            sayiDizisi[i] = rd.nextInt(100);
        }
        return sayiDizisi;
    }

}
