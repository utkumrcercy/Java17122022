public class DiziIdekiEnBuyukSayi {

    /**
     * Dizinin içindeki en büyük sayıyı ekrana yazan
     * metodu oluşturun
     */

    public static void main(String[] args) {

        int[] sayiDizisi = new int[]{
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456,10048
        };


        System.out.println(max(sayiDizisi));
        System.out.println(min(sayiDizisi));

    }


    /**
     * Dizi içindeki en büyük değeri bulur
     * @param arr
     * @return
     */
    public static int max(int[] arr) {
        int i;
        int max = arr[0];

        for (i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Dizi içindeki en küçük değeri bulur
     * @param arr
     * @return
     */
    public static int min(int[] arr) {
        int i;
        int min = arr[0];

        for (i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
