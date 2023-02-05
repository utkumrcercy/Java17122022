import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class DosyaYazmaBufferedYontemi {

    public static void main(String[] args) {

        String okunanVeri = null;

        String yazdirilacakVeri = "Merhaba ! Ben Java tarafından dosyaya yazıldım\n";
        File dosya = new File("/home/mehmet/Projects/DosyaKlasorIslemleri/test.txt");

        BufferedWriter bufferedWriter;
        try {


            FileWriter fw = new FileWriter(dosya);
            bufferedWriter = new BufferedWriter(fw);
            bufferedWriter.write(yazdirilacakVeri);
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (Exception e) {
            System.out.println("Dosya yazırılırken bir hata oluştu");

        }

    }
}
