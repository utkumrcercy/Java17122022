public class Main {
    public static void main(String[] args) {

        // Exception Handling
//        System.out.println(1/0);

        /**
         * try{
         * hata çıkabilecek kodlar
         * } catch(Exception e){
         *  hata olduğunda yapılacak
         * }
         *
         */

        try {
            System.out.println(1 / 0);
        }catch (ArithmeticException a){
            System.out.println("Matematiksel Hata var !");
        }
        catch (Exception e) {
            System.out.println("Bir hata oluştu");
        } finally {
            System.out.println("Ben hata olsada olmasada sürekli çalışırım");
        }


        try {
            System.out.println(1 / 2);
        } catch (Exception e) {
            System.out.println("Bir Hata oluştu");
        }finally {
            System.out.println("Ben hata olsada olmasada sürekli çalışırım");

        }

        /**
         * throw bir istisnayı manuel olarak çalıştırmadır
         */

        int a = 3;

        try {
            if (a < 4) {
                throw new RuntimeException("A 4 den küçük geldi"); //Hatayı (Exception) manuel fırlattık
            }
        } catch (RuntimeException e) {
            System.out.println("A 4 den küçük geldi");
        }

    }
}