public class DiziEsitlikKontrolu {

    public static void main(String[] args) {
        /**
         * İki diziyi hazır metot olmadan (Arrays.equals)
         * kontrol eden metodu yazınız
         */

        int[] array1 = {2, 5, 7, 9, 11};
        int[] array2 = {2, 5, 7, 9, 11};
        int[] array3 = {1, 4, 7, 9, 11};
        int[] array4 = {1, 4, 7, 9, 11};

        System.out.println(controlEquals(array1, array2));
        System.out.println(controlEquals(array1, array3));
        System.out.println(controlEquals(array4, array3));
    }

    public static boolean controlEquals(int[] arr1, int[] arr2) {
        boolean equalOrNot = true;
        if (arr1.length != arr2.length) {
            equalOrNot = false;
        }else{
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    equalOrNot = false;
                }
            }

        }

        return equalOrNot;
    }
}
