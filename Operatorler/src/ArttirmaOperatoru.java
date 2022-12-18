public class ArttirmaOperatoru {

    public static void main(String[] args) {

        /*
            Arttırma - Azaltma Operatörleri
         */

        int a = 15;
        --a; // a nın değerini 1 azalt a = a -1
        System.out.println(a);
        a++; // anın değerini 1 arttır a =  a +1
        System.out.println(a);

        /*
        Atama operatörü  = eşittir
        += gelen değeri al üstüne sağdaki değeri topla
        -=
        *=
        /=
         */

        a += 2; // a nın değerini al 2 ile topla ve sonucu a ya eşitle( a = a+2)
        System.out.println(a);

        a -= 5; //a = a -5
        System.out.println(a);

        a *= 2; //a = a *2
        System.out.println(a);

        a /= 4; //a =  a/4
        System.out.println(a);


        /**
         *
         * 2 int değişkeni olsun
         * degeri rastgele verin
         * 1. değişkenin değerini 3 azaltın
         * 2. değişkenin deperini 5 arttırın
         * ve bunların toplamını ekrana yazın
         */

        int x = 16;
        int y = 56;

        x -= 3;
        y += 5;

        int sonuc = (x + y);

        System.out.println(sonuc);
        System.out.println( (x+y));

        x += y;
        System.out.println(x);
    }
}
