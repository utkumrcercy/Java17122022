import java.util.ArrayList;
import java.util.List;

public class CalisanIslem<T extends Calisanlar>  implements ICalisanIslem{

    private List<T> calisanList = new ArrayList<>();

    public void listeyeElemanEkle(T calisan) {
        this.calisanList.add(calisan);
    }


    public void listeyiBas() {
        for (T t : this.calisanList) {
            System.out.println(t);
        }
    }

    @Override
    public void listeyeElemanEkleI(Calisanlar eleman) {
        this.calisanList.add((T) eleman);
    }

    @Override
    public void listedenElemanCikarI(Calisanlar eleman) {

        this.calisanList.remove((T) eleman);
    }

    @Override
    public void listeyiBasI() {

        for (T t : this.calisanList) {
            System.out.println(t);
        }
    }
}
