import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        System.out.print("Lütfen adını öğrenmek istediğiniz ayın sıra numarasını girin: ");
        int ay = tarayici.nextInt();

        switch (ay) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;

            default:
                System.out.println("Böyle bir ay yok !");
        }


    }
}