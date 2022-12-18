public class Main {
    public static void main(String[] args) {

        // Primitif Tipler (İlker Tipler

        /**
         * Değişkenler
         *
         * Tanımlama : tip degiskenAdi; -> Değer atamadan değişken tanımlama
         * tip degiskenAdi = deger; -> Değer atayarak değişken tanımlama
         *
         */

        //integer Veri Tipi
        int ogrenciYasi; //Değer atamadan değişken tanımlama
        int ogrenciNo = 120; // Değer atayarak değişken tanımlama
        ogrenciYasi = 23;

        System.out.println(ogrenciYasi);
        System.out.println(ogrenciNo);
        System.out.println("Öğrenci Yaşı " +ogrenciYasi);
        System.out.println("Öğrenci No "+ ogrenciNo);


        //byte
        byte byteMaximumDeger = 127; //byte veri tipinin maximum alabileceği değer
        System.out.println("byteMaximumDeger isimli değişkenimin değeri "+ byteMaximumDeger);

        byte byteMinimumDeger = -128; //byte veri tipinin minimum alabileceği değer
        System.out.println("byteMinimumDeger isimli değişkenimin değeri "+byteMinimumDeger);

        //short
        short shortMaximumDeger = 32767;
        System.out.println("shortMaximumDeger isimli değişkenimin değeri " + shortMaximumDeger);

        short shortMinumumDeger = -32768;
        System.out.println("shortMinumumDeger isimli değişkenimin değeri " + shortMinumumDeger);

        //integer

        int integerMaximumDeger = 2147483647;
        System.out.println("integerMaximumDeger isimli değişkenimin değeri "+ integerMaximumDeger);

        int integerMinimumDeger = -2147483648;
        System.out.println("integerMinimumDeger isimli değişkenimin değeri "+ integerMinimumDeger);

        //long
        long longMaximumDeger =  6846846464658555554l;
        System.out.println("longMaximumDeger isimli değişkenimin değeri "+ longMaximumDeger);

        long longMinimumDeger =  -6846846464658555555l;
        System.out.println("longMinimumDeger isimli değişkenimin değeri "+ longMinimumDeger);

        //double
        double doubleMaximumValue = 545123123.656565656565656565656565656456565645654654654654654654d;
        System.out.println("doubleMaximumValue değişkeninin değeri " + doubleMaximumValue);

        //float
        float floatMaximumDeger = 565.65656565655464687987464687494698f;
        System.out.println("floatMaximumDeger değişkeninin değeri "+ floatMaximumDeger);

        //char
        char charDegeri = 'A';
        System.out.println("charDegeri değişkeninin değeri "+ charDegeri);

        //String
        String stringVeriDegeri = "Merhaba Java !";
        System.out.println("stringVeriDegeri değişkeninin değeri "+ stringVeriDegeri);

        //boolean
        boolean booleanDegeri = false;
        boolean booleanDegeri2 = true;

        System.out.println("booleanDegeri değişkeninin değeri "+ booleanDegeri);
        System.out.println("booleanDegeri2 değişkeninin değeri "+ booleanDegeri2);


    }
}