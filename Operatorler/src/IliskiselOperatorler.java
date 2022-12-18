public class IliskiselOperatorler {

    public static void main(String[] args) {

        /**
         * İlişkisel operatörler
         * •	< (Küçüktür)
         * •	> (Büyüktür)
         * •	== (Eşittir)
         * •	!= (Eşit değildir)
         * •	<= (Küçük eşittir) veya işlemi görülür
         * •	>= (Büyük eşittir) veya işlemi görülür
         *
         * Sonuc boolean gelir true false
         */

        int a = 15;
        int b = 12;
        int c = 15;

        boolean aByeEsitMi = (a == b);

        System.out.println("a ile b bir birine eşit midir? " + (a == b));
        System.out.println("a ile b bir birine eşit midir? " + aByeEsitMi);
        System.out.println("a b den büyük mü ?" + (a > b));
        System.out.println("a b den küçük mü? " + (a < b));
        System.out.println("a c ye eşit mi?" + (a == c));
        System.out.println("a b ye eşit değil midir ? " + (a != b));
        System.out.println("a b ye eşit veya b den büyük mü ?" + (a >= b));
        System.out.println("b a dan küçük veya eşit mi ?" + (b <= a));


    }
}
