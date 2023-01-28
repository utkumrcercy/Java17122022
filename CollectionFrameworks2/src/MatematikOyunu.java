import java.util.Scanner;
import java.util.TreeMap;

public class MatematikOyunu {

    public static void main(String[] args) {
        ///---> Değişken Tanımlaması <---\\\
        String ayrac = new String(new char[15]).replace("\0", "-");
        ///---> Generic TreeMap Tanımlaması <---\\\
        TreeMap<Integer, Integer> mathGeneric = new TreeMap<>();
        ///---> Gerekli Değişkenler ve Scanner Sınıfının Tanımlaması <---\\\
        int puan = 0, dogru = 0, yanlis = 0, degisim = 0, tahmin;
        Scanner scanner = new Scanner(System.in);
        ///---> Oyun Yapımız İçin Veri Girişi Tanımlayalım <---\\\
        for (int i = 1; i <= 10; i++)
            mathGeneric.put(i, (i * i));
        ///---> Oyunumuzun Sistemini Kuralım <---\\\
        System.out.println(ayrac + "\n< Java TreeMap Örnekleri >\n" + ayrac);
        for (int i = 1; i <= mathGeneric.size(); i++) {
            if (degisim <= 2 || degisim >= 4) {
                if (dogru > 1 && dogru <= 2) {
                    if (i == 3) {
                        System.out.print("-> [" + (mathGeneric.get(i)) + "] Değerin Karesi Kaçtır: ");
                        tahmin = Integer.parseInt(scanner.next());
                        if (tahmin == mathGeneric.get(i) * mathGeneric.get(i)) {
                            dogru++;
                            puan += 100;
                        } else {
                            yanlis++;
                            puan -= 100;
                        }
                    }
                } else if (dogru == 3 || dogru >= 5 && dogru <= 8) {
                    System.out.print("-> [" + mathGeneric.lastKey() + "] Değerinin Karesi Kaçtır: ");
                    tahmin = Integer.parseInt(scanner.next());
                    if (tahmin == (mathGeneric.lastKey() * mathGeneric.lastKey())) {
                        dogru++;
                        puan += 100;
                    } else {
                        yanlis++;
                        puan -= 100;
                    }
                    mathGeneric.remove(mathGeneric.lastKey());
                    i -= 1;
                } else {
                    System.out.print("-> [" + mathGeneric.get(i) + "] Değerine Hangi Rakamın Karesi İle Ulaşılır: ");
                    tahmin = Integer.parseInt(scanner.next());
                    if (tahmin == i) {
                        dogru++;
                        puan += 100;
                    } else {
                        yanlis++;
                        puan -= 100;
                    }
                }
            } else {
                System.out.print("-> [" + mathGeneric.get(i) + "] Değerine Hangi Rakamın Karesi İle Ulaşılır: ");
                tahmin = Integer.parseInt(scanner.next());
                if (tahmin == i) {
                    dogru++;
                    puan += 100;
                } else {
                    yanlis++;
                    puan -= 100;
                }
            }
            degisim++;
            if (degisim > 6) {
                degisim = 0;
            }
        }
        System.out.println(ayrac + "\n-> Doğru Sayısı: " + dogru + "\n-> Yanlış Sayısı: " + yanlis + "\n-> Puanınız: " + puan + "\n" + ayrac);

    }
}
