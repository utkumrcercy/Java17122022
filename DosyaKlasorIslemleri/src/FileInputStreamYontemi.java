import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamYontemi {

    public static void main(String[] args) {

        String okunanVeriler = null;
        File dosya = new File("/home/mehmet/Projects/DosyaKlasorIslemleri/test.txt");

        FileInputStream fileInputStream;

        System.out.println(dosya.length()); //  Dosya Boyutu
        System.out.println(dosya.canRead()); // Dosya okunabilir mi
        System.out.println(dosya.exists()); // Dosya mevcut mu
        System.out.println(dosya.canExecute()); // Dosya çalıştırılabilir mi ?

        byte veriler[] = new byte[(int) dosya.length()];

        try {

            fileInputStream = new FileInputStream(dosya);
            fileInputStream.read(veriler);
            okunanVeriler = new String(veriler);
            System.out.println(okunanVeriler);


        } catch (Exception e) {
            System.out.println("Bir hata oluştu");
        }

    }
}
