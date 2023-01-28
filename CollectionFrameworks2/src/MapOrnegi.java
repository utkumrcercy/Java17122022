import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapOrnegi {

    public static void main(String[] args) {

        /**
         * Anahtar değer şeklinde
         * çiftli veri alan yapılardır
         */

        Map<String, String> kullanicilar = new HashMap<>();

        kullanicilar.put("ad", "Mehmet");
        kullanicilar.put("soyad", "Öztürk");
        kullanicilar.put("yas", "29");


        System.out.println(kullanicilar.get("ad"));
        System.out.println(kullanicilar.get("soyad"));
        System.out.println(kullanicilar.get("yas"));

        for (Map.Entry<String, String> set : kullanicilar.entrySet()) {
            System.out.println(set.getKey() + ": " + set.getValue());
        }

        kullanicilar.forEach((anahtar, deger) -> System.out.println(anahtar + ":" + deger));


        Map<Character, String> sporlar = new HashMap<>();

        sporlar.put('B', "Basketbol");
        sporlar.put('F', "Futbol");
        sporlar.put('Y', "Yüzme");
        sporlar.put('K', "Kayak");

        sporlar.forEach( (key,value) -> System.out.println(key + ":"+ value));
    }
}
