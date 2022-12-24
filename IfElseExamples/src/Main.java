import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Kullanıcıdan yaşını alalım
         * eğer 18 den büyük veya eşit ise
         * eğlence merkezine girebilir
         * değil ise de giremesin
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz:");

        int yas = scanner.nextInt();
        if (yas >= 18){
            System.out.println("Eğlence merkezine girebilirsiniz.");
        }else{
            System.out.println("Eğlence merkezine giremezsiniz!");
        }


    }
}