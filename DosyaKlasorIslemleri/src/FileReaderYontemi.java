import java.io.File;
import java.io.FileReader;

public class FileReaderYontemi {

    public static void main(String[] args) {

        String okunanVeriler = null;
        File dosya = new File("/home/mehmet/Projects/DosyaKlasorIslemleri/test.txt");
        FileReader fileReader;
        char veriler[] = new char[(int) dosya.length()];

        try {

            fileReader = new FileReader(dosya);
            fileReader.read(veriler);
            okunanVeriler = new String(veriler);

            System.out.println(okunanVeriler);

        } catch (Exception e) {
            System.out.println("Bir hata oluştu");
        }

    }
}
