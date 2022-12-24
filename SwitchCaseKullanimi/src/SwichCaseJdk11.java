import java.util.Scanner;

public class SwichCaseJdk11 {

    public static void main(String[] args) {

        Scanner tarayici = new Scanner(System.in);

        System.out.print("Lütfen sıra numarasını öğrenmek istediğiniz ayın adını girin: ");
        String ay = tarayici.nextLine();

        int sira = 0;

        System.out.println(ay);
//
//        switch (ay) {
//            case "OCAK", "OCK" ->{
//                sira = 1;}
//
//            default -> sira = 0;
//        }

        System.out.println(sira);
    }
}
