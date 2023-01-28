import java.util.TreeMap;

public class TreeMapOrnek {

    public static void main(String[] args) {

        /**
         * TreeMap
         *
         * put
         * remove
         * get
         *
         * CeilingEntry
         * Comparator
         */

        TreeMap genericOlmayan = new TreeMap();

        TreeMap<String, String> generic = new TreeMap<>();

        genericOlmayan.put("Cat", 12.5D);
        genericOlmayan.put("Lion", "Aslan");
        genericOlmayan.put("Bird", "Kuş");
        genericOlmayan.put("yas", 12);


        genericOlmayan.forEach( (key,value) -> System.out.println(key +":"+value) );


        generic.put("ad", "Mehmet");
        generic.put("soyad", "Öztürk");
        generic.put("anneAdi", "Abc");
        generic.put("babaAdi", "Def");

        generic.forEach( (key,value) -> System.out.println("Anahtar =>" + key +"\t\t Value =>" + value) );


        String ayrac = new String(new char[30]).replace("\0", "-");

        System.out.println(ayrac+ "Tree Map Metotları"+ayrac);

        System.out.println("Eşleşen kayılar: "+ generic.entrySet());
        System.out.println("TreeMap uzunluğu: "+ generic.size());
        System.out.println("İlk Anahtar: " + generic.firstKey());
        System.out.println("Son Son Anahtar: " +generic.lastKey());
        System.out.println("İlk Map: "+ generic.firstEntry() );
        System.out.println("Son Map: "+ generic.lastEntry());
        System.out.println("ad isimli anahtar siliniyor"+ generic.remove("ad")+ " yeni uzunluk "+ generic.size());
        System.out.println("CeilingEntry(soyad) : " + generic.ceilingKey("soyad"));

        generic.forEach( (key,value) -> System.out.println("Anahtar =>" + key +"\t\t Value =>" + value) );

        System.out.println("Comparator: " + generic.comparator());


    }
}
