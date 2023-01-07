import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CokBoyutluDizi {

    public static void main(String[] args) {
/*
        String a[][] = new String[3][3];

        a[0][0] = "Java";
        a[0][1] = " Programlamaya";
        a[0][2] = " Başladınız !";
        a[1][0] = " Bu aşamada";
        a[1][1] = " temel kavramları";
        a[1][2] = "bitirdiniz";
        a[2][0] = "Artık";
        a[2][1] = " İleri seviye";
        a[2][2] = " başlanabilir !\n";

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
            }
        }

        int b[][] = {{1, 0, 0, 0, 0}, {2, 3, 0, 0, 0}, {4, 5, 6, 0, 0}, {7, 8, 9, 10, 0},
                {11, 12, 13, 14, 15}, {2, 3, 6, 468, 46846}};

        System.out.println("Dizi Boyutu: " +  b[0].length);

        for (int i = 0; i < 6; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }


        //Arrays.asList Metodu (Array'i Liste türüne çevirir)

        String array[] = {"Ahmet", "Atilla", "Furkan"};

        List<String> isimler2 = new ArrayList<>();

        isimler2 = Arrays.asList(array);

        System.out.println(isimler2.get(0));
        List<String> isimler = new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Atilla");
        isimler.add("Furkan");


        for (String s : isimler) {
            System.out.println(s);
        }

        System.out.println(isimler.get(0));
*/

        // Arrays.CopyOf Metodu

        int[] aDizisi = new int[]{15, 20, 30, 50, 90};
        System.out.println("Dizinin normal çıktısı");

        for (int i : aDizisi) {
            System.out.println(i);
        }

        int[] copy = Arrays.copyOf(aDizisi, 3);

        for (int i : copy) {
            System.out.println(i);
        }

        // Arrays.copyOfRange metodu

        int[] kopya = Arrays.copyOfRange(aDizisi, 0, aDizisi.length);
        for (int i : kopya) {
            System.out.println(i);
        }

        //  Arrays.fil metodu

        Arrays.fill(kopya, 0,3,55);

        for (int i : kopya) {
            System.out.println(i);
        }
    }
}
