import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderYontemi {
    public static void main(String[] args) {


        /**
         *  JAVA IO BufferedReader Yöntemi
         */

        String okunanVeriler = null;

        // Windowsta:  C:\\test.txt
        File dosya = new File("/home/mehmet/Projects/DosyaKlasorIslemleri/test.txt");
        FileReader reader;
        BufferedReader bufferedReader;

        try {

            reader = new FileReader(dosya);
            bufferedReader = new BufferedReader(reader);
            okunanVeriler = bufferedReader.readLine();
            System.out.println(okunanVeriler);

        } catch (Exception e) {
            System.out.println("Dosya Okunurken Bir Hata Oluştu !");
        }


    }
}