public class ThreadOrnek extends Thread{

    public static void main(String[] args) {
        ThreadOrnek ornek = new ThreadOrnek();
        ornek.start();
        System.out.println("Merhaba Thread !");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(0);
            System.out.println("Uzun bir işlem sonucu");
        } catch (InterruptedException e) {
            System.out.println("Thread oluşurken hata oluştu");
        }
    }
}
