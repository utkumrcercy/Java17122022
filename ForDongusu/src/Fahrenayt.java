public class Fahrenayt {

    public static void main(String[] args) {


        /**
         * 50 Derece = 122.0 Fahrenheit
         * 51 Derece = 123.8 Fahrenheit
         * 52 Derece = 125.60000000000001 Fahrenheit
         * 53 Derece = 127.4 Fahrenheit
         * 54 Derece = 129.2 Fahrenheit
         * 55 Derece = 131.0 Fahrenheit
         * 56 Derece = 132.8 Fahrenheit
         * 57 Derece = 134.60000000000002 Fahrenheit
         * 58 Derece = 136.4 Fahrenheit
         * 59 Derece = 138.2 Fahrenheit
         * 60 Derece = 140.0 Fahrenheit
         */

        for (int c = 50; c <= 60; c++) {
            /**
             *  1 f = 1c *1.8+32
             */

            double f = c * 1.8 + 32;

            System.out.println(c+" Derece = "+ f +" Fahrenheit");
        }


    }
}
