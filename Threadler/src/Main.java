public class Main {
    public static void main(String[] args) {

        /**
         * Thread  aynı anda birden fazla işi
         * yapan yapılardır
         */
        uzunbirislem();
        System.out.println("Merhaba Thread !");

    }

    private static void uzunbirislem() {

        try {

            Thread.sleep(5 * 1000);
            System.out.println("Uzun bir işlem sonucu");


        } catch (InterruptedException exception) {
            System.out.println("Tread oluşurken bir hata oluştu");
        }


    }
}