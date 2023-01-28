import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHassetOrnek {

    public static void main(String[] args) {
        /**
         * LinkedHashSet  eklenme sırasına göre listeler
         * HashSet sıralama yaparak (A-z) listeler
         */

        LinkedHashSet<String> roler = new LinkedHashSet<>();

        roler.add("Zabıta");
        roler.add("Memur");
        roler.add("Amir");

        for (String s : roler) {
            System.out.println(s);
        }

        HashSet<String> rollerHas = new HashSet<>();

        rollerHas.add("Zabıta");
        rollerHas.add("Memur");
        rollerHas.add("Amir");

        for (String s : rollerHas) {
            System.out.println(s);
        }


        LinkedHashMap<String, String> rol = new LinkedHashMap<>();

        rol.put("rol", "admin");
        rol.put("amir", "Kerem");

        rol.forEach( (key, value) -> System.out.println(key+":"+value)  );

    }
}
