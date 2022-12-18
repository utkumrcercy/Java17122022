public class Main {
    public static void main(String[] args) {

        /**
         * Operatörler
         *
         */

        /** Aritmetiksel Operatörler
         *  +, -, *, /, %, --, ++,
         */

        int a = 30;
        int b = 40;

        int toplama = a + b; //Toplama
        System.out.println(toplama);

        int cikarma = a - b; // Çıkarma
        System.out.println(cikarma);

        int carpma = a * b; //Çarpma
        System.out.println(carpma);

        int bolme = a / b; //Bölme
        System.out.println(bolme);

        int mod = a % b; //Mod alma
        System.out.println(mod);

        System.out.println("a ile b nin toplamı " + (a + b));
        System.out.println("a ile b nin farkı " + (a - b));
        System.out.println("a ile b nin çarpımı " + (a * b));
        System.out.println("a ile b nin bölümü " + (a / b));
        System.out.println("a ile b nin bölümünden kalan " +(a%b));


    }
}