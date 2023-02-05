import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class DosyaYazmaFileWriterYontemi {

    public static void main(String[] args) {

        String okunanVeri = null;

        String yazdirilacakVeri = "Merhaba ! Ben Java tarafından dosyaya yazıldım 2\n";
        File dosya = new File("/home/mehmet/Projects/DosyaKlasorIslemleri/test.txt");

        FileWriter fileWriter;
        FileReader fileReader;

        char okunanVeriler[];

        try {

            fileWriter = new FileWriter(dosya);
            fileWriter.write(yazdirilacakVeri + "\n");
            fileWriter.close();


            fileReader = new FileReader(dosya);
            okunanVeriler = new char[(int) dosya.length()];
            fileReader.read(okunanVeriler);
            System.out.println(okunanVeriler);
        } catch (Exception e) {
            System.out.println("Dosya yazılırken bir hata oluştu");
        }

    }
}
