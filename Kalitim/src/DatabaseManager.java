import java.util.Scanner;

public class DatabaseManager {

    private IDataBase dataBase;

    public DatabaseManager(IDataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void loginDataBase() {
        dataBase.login();
    }

    public void addDataBase() {
        dataBase.add();
    }

    public void updateDataBase() {
        dataBase.update();
    }

    public void deleteDataBase() {
        dataBase.delete();
    }

    public void getDataBase() {
        dataBase.get();
    }

    public void selectMenu() {

        Scanner scanner = new Scanner(System.in);

        int karar;

        System.out.print("###Gerçekleştirilecek İşlemler###\n-----------------\n" +
                "[1] - Veri Ekle\n[2] - Veri Sil\n[3] - Veri Getir\n[4] - Veri Güncelle" +
                "\n-----------------\n\nKararınız:");

        karar = scanner.nextInt();

        switch (karar) {

            case 1:
                System.out.println("--------------------------------");
                addDataBase();
                System.out.println("--------------------------------");
                break;
            case  2:
                System.out.println("--------------------------------");
                deleteDataBase();
                System.out.println("--------------------------------");
                break;
            case  3:
                System.out.println("--------------------------------");
                getDataBase();
                System.out.println("--------------------------------");
                break;
            case  4:
                System.out.println("--------------------------------");
                updateDataBase();
                System.out.println("--------------------------------");
                break;
            default:
                System.out.println("Hatalı Seçim !");
                break;

        }
    }
}
