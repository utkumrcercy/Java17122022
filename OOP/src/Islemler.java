public class Islemler {

    /**
     * Erişimler
     * private public protected defult
     * <p>
     * public => her taraftan erişilebilir
     * <p>
     * private  => Önüne gelen yapıyı  sadece sınıf içerisinde kullanabilirsin
     * <p>
     * protected => Yapının sadece bağlı olduğu pakette kullanılmasına izin verir
     * <p>
     * default  => Sadece tanımlandığı yapıda kullanabilir
     */

    int topla(int x, int y) {

        return x + y;
    }

    int cikarma(int x, int y) {
        return x - y;
    }

    int carp(int x, int y) {
        return x * y;
    }

    int bol(int x, int y) {

        if (y == 0) {
            y = 1;
        }

        return x / y;
    }

    /**
     * Metot aşırı yükleme
     * ovverriding
     */
    Double bol(Double x, Long y) {

        if (y == 0) {
            y = 1L;
        }

        return x / y;
    }

}
