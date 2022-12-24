import java.util.Scanner;

public class WhileOrnek {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");

        int sayi = scanner.nextInt();
        while (0 < sayi) {
            System.out.println(sayi);
            sayi -= 2;
        }


        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = scanner.nextInt();

        while (sayi < 101) {
            System.out.println(sayi);
            sayi += 2;
        }


    }
}
