public class TekrarEdenEleman {

    public static void main(String[] args) {

        /**
         * Array içerisinde tekrar eden kaydı bulan
         * metodu yazınız
         */

        String[] isimler = new String[]{"Ahmet", "Mehmet", "Mehmet", "Ali", "Mehmet"};
        findDublicate(isimler);

    }

    public static void findDublicate(String[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i + 1; j < array.length; j++) {

                if (array[i].equals(array[j]) && (i != j)) {
                    System.out.println("Bu değer tekrar ediyor: " + array[j]);
                }

            }
        }

    }
}
