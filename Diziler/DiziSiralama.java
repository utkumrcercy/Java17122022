import java.util.Arrays;
import java.util.Collections;

public class DiziSiralama {

    public static void main(String[] args) {

        /**
         * Dizi Eleman Sıralama
         * Arrays.sort(dizi) => küçükten büyüğe a-z
         * Arrays.sort(dizi, Collection.reverseOrder() ) => ters sıralama
         */

        int[] siralanmamisDizi = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8};

        for (int i : siralanmamisDizi) {
            System.out.println(i);
        }

        Arrays.sort(siralanmamisDizi);

        for (int i : siralanmamisDizi) {
            System.out.println(i);
        }

        char[] siralanmamisChar = new char[]{'Z', 'B', 'F', 'A'};
        Arrays.sort(siralanmamisChar);

        for (char c : siralanmamisChar) {
            System.out.println(c);
        }


        /**
         * Tersten Sıralama
         */
        int [] arr = {10, 20, 30, 40, 50};


        int i, t;
        for (i = 0; i < arr.length / 2; i++) {
            t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }

        for (int i1 : arr) {
            System.out.println(i1);
        }
    }
}
