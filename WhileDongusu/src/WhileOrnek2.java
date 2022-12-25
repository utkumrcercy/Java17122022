import java.util.Scanner;

public class WhileOrnek2 {

    public static void main(String[] args) {

        /**
         * While döngüsü ile klavyeden girilen sayıdan 0’a kadar olan sayıların
         * toplamını hesaplayan program.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı girin: ");

        int sayi = scanner.nextInt();

        int toplam = 0;

        while (0 < sayi) {
            toplam += sayi; // toplam = toplam +sayi
            --sayi;
        }

        System.out.println("Toplam: " + toplam);


    }
}
