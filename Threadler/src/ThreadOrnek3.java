public class ThreadOrnek3 implements Runnable{


    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadOrnek3());
        Thread t2 = new Thread(new ThreadOrnek3());

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
