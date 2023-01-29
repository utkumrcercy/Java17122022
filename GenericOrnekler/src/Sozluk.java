import java.util.Dictionary;
import java.util.Hashtable;

public class Sozluk<A, D> {

    private Dictionary<A, D> sozluk = new Hashtable<A, D>();

    public void ekle(A anahtar, D deger) {
        this.sozluk.put(anahtar, deger);
    }

    public D getir(A anahtar) {
        return this.sozluk.get(anahtar);
    }

}
