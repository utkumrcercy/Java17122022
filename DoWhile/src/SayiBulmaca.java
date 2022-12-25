import java.util.Random;
import java.util.Scanner;

public class SayiBulmaca {

    public static void main(String[] args) {

        Random r = new Random();

        int sayi = r.nextInt(50);
        int n;

        /**
         *
         * break  -> kır demek döngüyü sonlandırır
         * continue -> devam et döngüyü sürekli başa atar
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tahmin ettiğiniz sayıyı girin: ");

        do {
            n = scanner.nextInt();
            System.out.println("Rast gele sayı: " + sayi);

            if (n > sayi) {
                System.out.println("Tahmininiz sayıdan büyük. Tahmininizi küçülterek yeniden deneyin");
            } else if (n < sayi) {
                System.out.println("Tahmininiz sayıdan küçüktür. Tahmininizi büyülterek yeniden deneyin");

            }else{
                System.out.println("Tebrikler sayıyı buldunuz  !");
                break;
            }

        } while (true);
    }
}
