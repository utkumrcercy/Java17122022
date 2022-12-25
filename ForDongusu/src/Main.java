import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         *
         * for (değişken; koşul; arttırma-azaltma){
         *
         * }
         *
         *
         */


        for (int i = 10; i > -1; i--) {
            System.out.print(i + "");
        }

        for (int i = 0; i < 11; i++) {
            System.out.print(i + "");
        }


        /**
         * Kullanıcıdan alınan sayıya kadar olan sayıları yan yana yazın
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int i = 1; i <= sayi; i++) {
            System.out.print(i+" ");
        }


        /**
         * Kullanıcıdan alınan sayıya kadar olan  çif sayıları yan yana yazın
         */
        System.out.println();


        for (int i = 0; i <= sayi; i+=2) {
            System.out.print(i+" ");
        }
        System.out.println();

        /**
         * Kullanıcıdan alınan sayıya kadar olan  tek sayıları yan yana yazın
         */

        for (int i = 1; i <= sayi; i+=2) {
            System.out.print(i+" ");
        }
    }
}