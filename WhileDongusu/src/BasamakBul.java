import java.util.Scanner;

public class BasamakBul {

    public static void main(String[] args) {


        /**
         * Girilen sayının kaç basamaklı olduğunu bulan program.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basamak sayısı bulunacak sayıyı girin: ");

        int sayi = scanner.nextInt();

        int basamak = 1;

        while (sayi >= 10) {
            sayi /= 10;
            basamak++;
        }

        System.out.println(basamak);



    }
}
