import java.util.Random;

public class RastGeleIslem {

    public static void main(String[] args) {


        Random r = new Random();

        int islem = r.nextInt(4);

        System.out.println("işlem" + islem);

        if (islem == 1) {
            System.out.println(5+4);
        } else if (islem == 2) {
            System.out.println(5-4);
        } else if (islem == 3) {
            System.out.println(5 * 4);
        } else {
            System.out.println(5/4);
        }


    }

}
