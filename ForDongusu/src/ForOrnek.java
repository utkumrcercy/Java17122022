import java.util.Scanner;

public class ForOrnek {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin");
        int sayi = scanner.nextInt();

        int tekToplam = 0;
        int ciftToplam = 0;

        for (int i = 0; i <= sayi; i += 2) {
            ciftToplam += i;
        }

        for (int i = 1; i <= sayi; i += 2) {
            tekToplam += i;
        }

        System.out.println("Tek Toplam: " + tekToplam);
        System.out.println("Çift Toplam: " + ciftToplam);

    }
}
