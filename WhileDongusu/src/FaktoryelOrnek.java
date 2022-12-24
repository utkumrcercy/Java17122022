import java.util.Scanner;

public class FaktoryelOrnek {


    public static void main(String[] args) {


        /**
         * While döngüsü ile sayının faktöriyelini hesaplama programı.
         */

        Scanner scanner = new Scanner(System.in);
        long faktoryel = 1l;

        System.out.print("Lütfen bir sayı girin: ");

        int sayi = scanner.nextInt();

        if (sayi == 0) {
            System.out.println("Sıfırın faktöryeli 1 olduğu için sayı 1 ' e eşitlendi");
            sayi = 1;
        }


        while (sayi > 0) {
            faktoryel *= sayi;
            System.out.println(faktoryel);
            sayi--;
        }
    }
}
