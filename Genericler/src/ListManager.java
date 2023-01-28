import java.util.ArrayList;

public class ListManager<T> {
    private ArrayList<T> list = new ArrayList<>();

    public void addList(T element) {
        this.list.add(element);
    }

    public ArrayList<T> getList() {
        return this.list;
    }
}
