import java.util.Scanner;

public class MetotOrnek {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String ad,soyad;
        int yas;

        System.out.print("Lütfen Adınızı Girin: ");
        ad = scanner.nextLine();

        System.out.print("Lütfen Soyadınızı Girin: ");
        soyad = scanner.nextLine();

        System.out.print("Lütfen Yaşınızı Girin: ");
        yas = scanner.nextInt();

        bilgiYaz(ad,soyad,yas);

    }

    public static void bilgiYaz(String ad, String soyad, int yas) {

        System.out.println("AD " + ad);
        System.out.println("SOYAD " + soyad);
        System.out.println("YAŞ " + yas);

    }
}
