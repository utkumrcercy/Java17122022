import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {


        /**
         * HashSet
         *
         * add içeri veri atmamızı sağlar
         * remove içerdeki veriyi silmemizi sağlıyor
         * clear içeriği komple temizer
         * size  uzunlugu verir
         * contains  içerdeki değerleri arar boolean deger doner
         * isEmpty  içeriği boş olup olmadığını kontrol eder boolean değer döner
         *
         */

        /**

        HashSet<String> roller = new HashSet<>(); // String tipinde tanımlama (Generic)
        roller.add("Admin"); // roller hassetine veri ekledik
        roller.add("Admin"); // roller hassetine veri ekledik fakat tekrarlandığı için veri gözardı edildi
        roller.add("Memur");

        for (String s : roller) {
            System.out.println(s);
        }

        HashSet durumlar = new HashSet(); // Tipsiz tanımlama
        durumlar.add("Aktif");
        durumlar.add(true);
        durumlar.add(12L);
        durumlar.add(12.2F);

        for (Object o : durumlar) {
            System.out.println(o);
        }
        String ayrac = new String(new char[30]).replace("\0","-");
        System.out.println(ayrac + "\n" + "HashSet Metot Örnekleri\n"+ ayrac);

        System.out.println("roller HashSetBoyutu : "+ roller.size());
        System.out.println("durumlar HashSetBoyutu : "+ durumlar.size());

        System.out.print("durumlar HashSet İçeriği: ");
        durumlar.forEach( item -> System.out.print("[" + item + "]"+ "\t") );
        System.out.println();

        System.out.println("durumlar boş mu : " + durumlar.isEmpty());
        System.out.println("roller HashSetinde Admin var mı ?: " +  roller.contains("Admin"));

        System.out.println("durumlar HasSeti temizleniyor !!");
        durumlar.clear();
        System.out.println("durumlar boş mu : " + durumlar.isEmpty());

        System.out.println(ayrac);
*/

        A101 mehmet = new A101(1L, "Mehmet", "Öztürk", "Mühendis", 35000.00D, 30L);
        A101 ali = new A101(2L, "Ali", "Kavak", "Analist", 25000.00D, 15L);
        A101 veli = new A101(3L, "Veli", "Kasap", "DBA", 55000.00D, 15L);

        HashSet<A101> calisanHashSet = new HashSet<>();
        calisanHashSet.add(mehmet);
        calisanHashSet.add(ali);
        calisanHashSet.add(veli);

        System.out.println("[ÇALIŞAN NO]\t\t\t[AD]\t\t\t[SOYAD]\t\t\t[MESLEK]\t\t\t[MAAŞ]\t\t\t[GÜN]");

        Iterator itr = calisanHashSet.iterator();//iterator HashSet içinde dolaşmamızı sağlıyor

        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

        for (A101 a101 : calisanHashSet) {
            System.out.println(a101);
        }

        calisanHashSet.forEach( item -> System.out.println(item));
    }
}