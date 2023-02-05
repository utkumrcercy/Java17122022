import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedInputStreamYontemi {

    public static void main(String[] args) {

        String okunanVeriler = null;

        // Windowsta:  C:\\test.txt
        File dosya = new File("/home/mehmet/Projects/DosyaKlasorIslemleri/test.txt");

        byte veriDizisi[] = new byte[(int) dosya.length()];

        int okumaSayisi = 0;

        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;

        try {
            fileInputStream = new FileInputStream(dosya);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            while ((okumaSayisi = bufferedInputStream.read(veriDizisi)) != -1) {
                okunanVeriler = new String(veriDizisi, 0, okumaSayisi);
                System.out.println(okunanVeriler);

            }

            bufferedInputStream.close();
        } catch (Exception e) {
            System.out.println("Bit hata Oluştu");
        }


    }
}
