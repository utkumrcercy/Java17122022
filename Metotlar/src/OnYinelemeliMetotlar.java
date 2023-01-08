public class OnYinelemeliMetotlar {

    public static void main(String[] args) {

        /**
         * Recursive (Öz Yinelemeli) Kendi kendini çağıran metotlar
         */

        System.out.println(topla(12));
        System.out.println(fibonacci(15));
    }


    public static int topla(int a) {

        if (0 <= a) {
            return (a + topla(a - 1));
        } else {
            return 0;
        }
    }

    public static int fibonacci(int n) {

        if ((n == 0) || (n == 1)) {
            return n;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
