import java.util.Scanner;

public class DegerDondurenMetotlar {

    public static void main(String[] args) {
        int s1, s2;
        float sonuc;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Sayı: ");
        s1 = scanner.nextInt();

        System.out.print("İkinci Sayı: ");
        s2 = scanner.nextInt();

        sonuc = bol(s1, s2);
        System.out.println(sonuc);

        int sonuc2 = carp();

        System.out.println(sonuc2);

    }

    /**
     * Değer döndüren ve parametre alan metot
     *
     */
    public static float bol(int sayi1, int sayi2) {
        int sonuc = (sayi1 / sayi2);
        return sonuc;
    }

    /**
     * Parametre almayan değer döndüren metot
     */

    public static int carp() {
        Scanner scanner = new Scanner(System.in);

        int s1, s2, sonuc;

        System.out.print("Sayı 1: ");
        s1 = scanner.nextInt();

        System.out.print("Sayı 2: ");
        s2 = scanner.nextInt();

        sonuc = s1 * s2;
        return sonuc;
    }
}
