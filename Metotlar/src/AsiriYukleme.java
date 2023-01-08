public class AsiriYukleme {

    public static void main(String[] args) {

        /**
         * Metot aşırı yükleme (Ovverloading)
         * Aynı isimde ayni tipte fakat parametre sayısı farklı olan metotlar
         */

        System.out.println(topla(1, 2));
        System.out.println(topla(1,2,3));

    }


    public static int topla(int a, int b) {
        return a + b;
    }

    public static int topla(int a, int b, int c) {
        return a + b + c;
    }

    public static int topla(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static int topla(int[] numbers) {

        int sonuc = 0;

        for (int i = 0; i < numbers.length; i++) {
            sonuc += numbers[i];
        }
        return sonuc;
    }

}
