import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    /**
     * Collection  (Kolleksiyonlar)
     *
     * List, Set, Map
     */
    public static void main(String[] args) {


        /**
         * ArrayList
         *
         * Eleman ekleme add()
         * Araya eleman ekleme  add(index, "deger")
         * Silmek için remove()
         */

        /**
        CreateCode code = new CreateCode();

        String ayrac = "----------------------------------";

        System.out.println(ayrac +
                "\n Oluşturulan Lisans Anahtarlari\n" +
                "" + ayrac);

        for (int i = 0; i < 5; i++) {
            System.out.println("-> Oluşturulan "+ (i+1) +
                    ". lisans Anahtarı :"+
                    code.newCode() +"\n");
        }
*/
        /*


        List<String> hayvanlar = new ArrayList();

        hayvanlar.add("Kuş");
        hayvanlar.add("Balık");
        hayvanlar.add("Aslan");

        // Listenin elemanını ekrana yazmak için get(indexno) kullanılır
        System.out.println(hayvanlar.get(0));
        for (String s : hayvanlar) {
            System.out.println(s);
        }


        hayvanlar.remove(2);

        for (String s : hayvanlar) {
            System.out.println(s);
        }

        hayvanlar.add(1, "Kaplumbağa"); // index değeri 1 olan elemanı güncelledi
        System.out.println(hayvanlar.get(1));

        for (String s : hayvanlar) {
            System.out.println(s);
        }
        **/

        /**
        List<Telefon> telefonList = new ArrayList<>();

        Telefon apple = new Telefon();
        apple.setMarka("Apple");
        apple.setModel("14 Pro");
        apple.setFiyat(57000D);

        telefonList.add(apple);

        Telefon xiaomi = new Telefon();
        xiaomi.setMarka("Xiaomi");
        xiaomi.setModel("XAS");
        xiaomi.setFiyat(12000D);
        telefonList.add(xiaomi);


        for (Telefon telefon : telefonList) {
            System.out.println(telefon);
            System.out.println(telefon.getFiyat());
        }

         */


        List<Integer> besSayiListesi = new ArrayList<Integer>();
        besSayiListesi.add(1);
        besSayiListesi.add(2);
        besSayiListesi.add(3);
        besSayiListesi.add(4);
        besSayiListesi.add(5);

/**

        //Var olan listeden başka bir liste oluşturma

        List<Integer> digerListe = new ArrayList<>(besSayiListesi);

        for (Integer sayi : digerListe) {
            System.out.println(sayi);
        }

        digerListe.add(6);
        digerListe.add(7);
        digerListe.add(8);
        digerListe.add(9);
        digerListe.add(10);


        for (Integer sayi : digerListe) {
            System.out.println(sayi);
        }

        for (Integer sa : besSayiListesi) {
            System.out.println(sa);
        }

 */

        /**
         * contains() listede elemanın olup olmadığını kontrol eder
         * ve sadece boolean tipte döner
         */

        if (besSayiListesi.contains(1)) {
            System.out.println("1 listenin içinde" );
        }

        Scanner scanner = new Scanner(System.in);


        System.out.print("Listeden silmek istediğiniz rakamı yazın");

        Integer secim = scanner.nextInt();

        if (besSayiListesi.contains(secim)) {
            besSayiListesi.remove(secim);
        }

        for (Integer integer : besSayiListesi) {
            System.out.println(integer);
        }
    }
}