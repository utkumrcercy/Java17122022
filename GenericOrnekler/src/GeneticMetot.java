import java.util.List;

public class GeneticMetot {

    public <T> boolean kontrolEt(T object1, T object2) {
        return object1.equals(object2);
    }

    public <T> boolean adresKontrolEt(T object1, T object2) {
        return object1 == object2;
    }

    public void printList(List<?> list) {

        for (Object o : list) {
            System.out.println(o);
        }
    }

    //Upper Bounded Wildcard
    public void printNumberList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }

    //Lower Bounded Wildcard
    public void printNuberListLower(List<? super Number> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
