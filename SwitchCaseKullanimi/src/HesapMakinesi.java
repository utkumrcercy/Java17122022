import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        /**
         * 1 +
         * 2 -
         * 3 /
         * 4 *
         *
         * Swich case kullanarak basit bir hesap makinesi oluşturun
         */

        Scanner tarayici = new Scanner(System.in);

        System.out.print("Toplama(+) Çıkarma(-) ....");
        String islem_operator = tarayici.nextLine(); //  Scanner string alacaksa ilk olarak alınmalıdır

        int  birinciSayi, ikinciSayi;
        double sonuc = 0;

        System.out.print("Lütfen birinci sayıyı girin: ");
        birinciSayi = tarayici.nextInt();

        System.out.print("Lütfen ikinci sayıyı girin: ");
        ikinciSayi = tarayici.nextInt();

       /* System.out.print(" Toplama için 1\n Çıkarma için 2\n" +
                " Çarpma için 3\n Bölme İçin 4 'ü seçiniz : ");

        islem = tarayici.nextInt();

        switch (islem) {

            case 1:
                sonuc = birinciSayi + ikinciSayi;
                break;
            case 2:
                sonuc = birinciSayi - ikinciSayi;
                break;
            case 3:
                sonuc = birinciSayi * ikinciSayi;
                break;
            case 4:

                if (ikinciSayi == 0) {
                    ikinciSayi = 1;
                }
                sonuc = birinciSayi / ikinciSayi;
                break;
            default:
                System.out.println("Hatalı işlem");

        }
*/


        tarayici.close();


        switch (islem_operator) {

            case "+":
                sonuc = birinciSayi + ikinciSayi;
                break;
            case "-":
                sonuc = birinciSayi - ikinciSayi;
                break;
            case "*":
                sonuc = birinciSayi * ikinciSayi;
                break;
            case "/":

                if (ikinciSayi == 0) {
                    ikinciSayi = 1;
                }
                sonuc = birinciSayi / ikinciSayi;
                break;
            default:
                System.out.println("Hatalı işlem");

        }
        System.out.println("Sonuç : "  + sonuc);


    }
}
