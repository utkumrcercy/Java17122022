import java.util.Scanner;

public class NotHesapla {

    public static void main(String[] args) {

        /**
         * Kullanıcıdan 1. , 2.  ve 3.  notunu alıp aritmetiksel
         * ortalamasını ekrana yazan programı yazın
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen birinci notunuzu girin: ");
        int birinciNot = scanner.nextInt();

        System.out.print("Lütfen ikinci notunuzu girin: ");
        int ikiciNot = scanner.nextInt();

        System.out.print("Lütfen üçüncü notunuzu girin: ");
        int ucuncuNot = scanner.nextInt();


        double ortalama = (birinciNot + ikiciNot + ucuncuNot) / 3;

        System.out.println("Ortalamanız " + ortalama + " !");


        /**
         *
         * ortalama
         * 80 > pekiyi
         * 70-80 iyi
         * 46-69 orta
         * 0-45  KÖTÜ
         */

        if (ortalama <= 45) {
            System.out.println("Kötü");
        } else if (ortalama > 45 && ortalama <= 70) {
            System.out.println("Orta");
        } else if (ortalama > 70 && ortalama <= 80) {
            System.out.println("İyi");
        } else {
            System.out.println("Pekiyi");
        }


    }
}
