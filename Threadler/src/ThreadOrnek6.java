public class ThreadOrnek6 implements Runnable{


    public static void main(String[] args) {

        Thread t1 = new Thread(new ThreadOrnek6());
        Thread t2 = new Thread(new ThreadOrnek6());
        Thread t3 = new Thread(new ThreadOrnek6());

        /**
         * Önemli NOT !
         * Thread e öncelik vermek sekronize çalışmasını
         * garanti etmez
         */

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);


        t1.start();
        t2.start();
        t3.start();

    }

    @Override
    public void run() {

        synchronized (ThreadOrnek6.class) {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }
}
