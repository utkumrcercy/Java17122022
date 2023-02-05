public class ThreadOrnek2 implements Runnable{
    public static void main(String[] args) {


        Thread t1 = new Thread(new ThreadOrnek2());
        t1.start();
        System.out.println("Merhaba thread !");

    }

    @Override
    public void run() {
        try {
            Thread.sleep(5 * 1000);
            System.out.println("Ben çalıştım");

        } catch (InterruptedException e) {
            System.out.println("Thread oluşurken hata oluştu");
        }
    }
}
