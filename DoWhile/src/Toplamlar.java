import java.util.Scanner;

public class Toplamlar {

    public static void main(String[] args) {

        //do while döngüsüyle girilen sayıdan 0’a kadar olan sayılarının toplamını yazan program.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");

        int sayi = scanner.nextInt();
        int toplam = 0;

        do {
            toplam += sayi;
            sayi--;

        } while (sayi > 0);

        System.out.println("Toplam: " + toplam);
    }
}
