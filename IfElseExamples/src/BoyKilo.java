import java.util.Scanner;

public class BoyKilo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double boy, kilo, endex; //Tek satırda değişken tanımlama

        System.out.print("Lütfen boyunuzu giriniz: ");
        boy = scanner.nextDouble() / 100;

        System.out.print("Kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        endex = kilo / (boy * boy);
        System.out.println("Endex : " + endex);

        /**
         * 18.5 < zayıf
         * 18.5 > 24.9 küçük veya eşit normal
         * 25 eşit veya büyül ve 29.9 dan küçük veya eşit ise şişman
         * 30 a eşit veya büyük ise obez
         */

        if (endex < 18.5) {
            System.out.println("Zayıf");
        } else if (endex >= 18.5 && endex <= 24.9) {
            System.out.println("Normal");
        } else if (endex >= 25 && endex <= 29.9) {
            System.out.println("Şişman");
        } else {
            System.out.println("Obez !");
        }

    }
}
