public class FaktoryelGosterim {

    public static void main(String[] args) {

        /**
         * 1! = 1
         * 2! = 2
         * 3! = 6
         * 4! = 24
         * 5! = 120
         */

        int faktoryel = 1;

        for (int i = 1; i <= 20; i++) {

            if (i == 6) {
                break;
            }
            faktoryel *= i;

            System.out.printf("%d! = %d\n", i, faktoryel);
            System.out.println(i + "! = " + faktoryel);

        }



    }
}
