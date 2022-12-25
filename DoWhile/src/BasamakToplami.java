import java.util.Scanner;

public class BasamakToplami {

    public static void main(String[] args) {
        //Girilen sayının basamaklarının toplamını yazan program

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");

        int sayi = sc.nextInt();
        int toplam = 0;

        do {
            toplam += sayi % 10;
            sayi /= 10;
        } while (sayi > 0);

        System.out.println("Basamak toplamları: "+ toplam);
    }
}
