public class ForOrnek3 {

    public static void main(String[] args) {
        /**
         *
         * 1-100 arasındaki çift sayıları ekrana yazın
         * sayı 30 ise döngü sonlansın
         */


        for (int i = 1; i <= 100; i++) {

            if (i == 32) {
                break;
            }

            if (i % 2 == 0) {
                System.out.println(i);

            }

        }



    }
}
