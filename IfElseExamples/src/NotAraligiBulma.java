import java.util.Scanner;

public class NotAraligiBulma {

    public static void main(String[] args) {

    /**
     * .Öğrenciden vize ve final notu istenerek,
     * öğrencinin not ortalamasının hangi harf aralığında olduğunu ve
     * geçme kalma durumunu hesaplayan program
     */

        Scanner tarayici = new Scanner(System.in);

        int vizeNotu, finalNotu;
        double ortalama;

        System.out.print("Vize Notunuzu Giriniz: ");
        vizeNotu = tarayici.nextInt();

        if (vizeNotu < 0 ||  vizeNotu > 101) {
            vizeNotu = 0;
        }

        System.out.print("Final Notunuzu Giriniz: ");
        finalNotu = tarayici.nextInt();

        if (!(finalNotu > -1) || !(finalNotu < 101)) {
            finalNotu = 0;
        }

        ortalama = (vizeNotu * 0.3) + (finalNotu * 0.7);

        System.out.println("Ortalamanız: " + ortalama);

        /**
         * 88  ve üzeri ise AA
         * 80-87.9 ise BA
         * 73-79.9 arasında BB
         * 66-72.9 CB
         * 60-65.9 CC
         * 55-59.9 DC
         * 50-54.9 DD
         * 50 < FF
         */
        if (ortalama >= 88 && ortalama <= 100) {
            System.out.println("AA");
        } else if (ortalama >= 80 && ortalama <= 87.9) {
            System.out.println("BA");
        } else if (ortalama >= 73 && ortalama <= 79.9) {
            System.out.println("BB");
        } else if (ortalama >= 66 && ortalama <= 72.9) {
            System.out.println("CB");
        } else if (ortalama >= 60 && ortalama <= 65.9) {
            System.out.println("CC");
        } else if (ortalama >= 55 && ortalama <= 59.9) {
            System.out.println("DC");
        } else if (ortalama >= 50 && ortalama <= 54.9) {
            System.out.println("DD");
        }else{
            System.out.println("FF");
        }

    }
}
