public class MantiksalOperatorler {


    public static void main(String[] args) {

        /**
         * Matıksal Operatörler
         * true yada false döner yani boolean bir değer döner
         *  ve  => && iki ifadeninde doğru olmasını bekler. •	&& Koşullu VE(AND) işlemi yapılmaktadır. Bütün sonuçlar
         *  kendi içinde true ise sonuç true, en az birisi bile false ise sonuç false olur.
         *  veya  => || iki ifadeden birinin doğru olmasını bekler •	|| Koşullu VEYA işlemi yapar. Karşılaştırılan
         *  iki değerden en az biri true olduğu sürece, true döndürmektedir
         *
         *  •	! NOT (DEĞİL) işlemi yapar. Sonucu true ise false, false ise true yapmaktadır.
         */

        int a = 12;
        int b = 15;

        int c = 20;
        int d = 25;

        System.out.println((a < b) && (c < d));
        System.out.println((a <= 12) || (c >= d));

        System.out.println( !(10==10)); // Olumsuza çevir

        System.out.println(3&14);

    }
}
