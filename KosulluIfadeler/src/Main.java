import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * if else if else
         *
         * if koşul{
         *  koşul doğru ise burası çalışır
         * }else if(ikinci koşul){
         *  birinci koşul doğru değil ise ve ikinci koşul doğru ise
         *  burası çalışır
         * }else{
         * koşulların tamamı yanlış ise
         * burası çalışır
         * }
         *
         */

        int a = 5;
        int b = 20;

        if ( a >21){
            System.out.println("a nın değeri 21 den büyüktür");
        }else if( a > 10){
            System.out.println("a nın değeri 10 dan büyüktür");
        }else{
            System.out.println("a nın değeri ne 21 den büyük ne de 10 dan büyüktür");
        }

        /**
         *
         * int gun  = 5 ;
         *
         * gunun hangisi olduğunu yazdıran program  Örn pazrtesi
         */

        System.out.print("Lütfen öğremek istediğiniz günün sıra numarasını girin: ");
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();



        if (a == 1) {
            System.out.println("Pazartesi");
        } else if (a == 2) {
            System.out.println("Salı");

        } else if (a == 3) {
            System.out.println("Çarşamba");
        } else if (a == 4) {
            System.out.println("Perşembe");
        } else if (a == 5) {
            System.out.println("Cuma");
        } else if (a == 6) {
            System.out.println("Cumartesi");
        } else if (a == 7) {
            System.out.println("Pazar");
        }else{
            System.out.println("Gün yanlış girildi");
        }


    }
}