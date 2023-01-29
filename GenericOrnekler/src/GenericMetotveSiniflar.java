public class GenericMetotveSiniflar<T> {

    public void yaz(T obje) {
        System.out.println(obje);
    }

    public <T> T degerDondur() {
        T object = null;

        return object;
    }

    public <T> T parametreliDonduren(T object) {
        return object;
    }

    public <T> void parametreliDondurmeyen(T object) {
        System.out.println(object);

    }
}
