import java.util.Scanner;

public class MetotOrnek2 {

    public static void main(String[] args) {


        /**
         * Kullanıcının girmiş olduğu sayıya kadar
         * sayıların çarpımını veren metodu yazın
         */

        /*
        !!!! Sayı sıfır olamaz
         */

        sayiyaKadarCarp();

        System.out.println("5 e kadar olan sayılların çarpımı: " + hesapla(0));
    }


    public static void sayiyaKadarCarp() {

        int sayi, carpim;

        carpim = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        sayi = scanner.nextInt();

        if (sayi == 0) {
            System.out.println("Sayı sıfır olamaz");
            sayi = 1;
        }

        for (int i = 1; i < (sayi + 1); i++) {
            carpim *= i;
        }

        System.out.println(sayi + " kadar olan sayıların çarpımı : " + carpim);
    }

    public static int hesapla(int s) {
        int carpim = 1;
        if (s == 0) {
            System.out.println("Sayı sıfır olamaz");
            s = 1;
        }
        for (int i = 1; i < (s + 1); i++) {
            carpim *= i;
        }

        return carpim;

    }
}
