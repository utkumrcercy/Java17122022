/**
 * Bir sınıf birden fazla interface ile implement (çağırılabilir) edilebilir.
 * Interface, anlık değişken içermezler. Bu yüzden interface üzerinde tanımlanan değişkenler, interface ile türetilen sınıflar tarafından değiştirilemezler.
 * Tanımlamalarını gerçekleştirirken sadece public veya default erişim belirleyici kullanabiliriz.
 * Tanımladığımız Interface’i, birden fazla sınıf çağırarak kullanabilir.
 * Interface üzerinde tanımlanan metotlar gövdesizdir. Bu yapısı ile abstract metotlara benzerlik gösterir.
 * Interface sınıfını kullanarak nesne üretemeyiz.
 */
public interface IArac {

    void ozellikYaz();

    void markaYaz();
}
