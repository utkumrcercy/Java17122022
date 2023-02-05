import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

public class DosyaYazmaFileOutputStreamYontemi {

    public static void main(String[] args) {

        String okunanVeri = null;

        String yazdirilacakVeri = "Merhaba ! Ben Java tarafından dosyaya yazıldım 2\n";
        File dosya = new File("/home/mehmet/Projects/DosyaKlasorIslemleri/test.txt");

        FileOutputStream fileOutputStream;
        FileReader fileReader;

        try {
            fileOutputStream = new FileOutputStream(dosya);

            byte byteVeriler[] = yazdirilacakVeri.getBytes(StandardCharsets.UTF_8);
            fileOutputStream.write(byteVeriler);
            fileOutputStream.close();


            System.out.println(yazdirilacakVeri.getBytes(StandardCharsets.UTF_8));

        } catch (Exception e) {
            System.out.println("Dosya yazılırken bir hata oluştu");
        }


    }
}
