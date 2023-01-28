import java.util.ArrayList;
import java.util.List;

public class ImmutableOrnek {

    private final List<String> finlList = new ArrayList<>();


    public ImmutableOrnek() {
        finlList.add("Ülvan");
        finlList.add("Hayati");
        finlList.add("Ercan");
        finlList.add("Mehmet Nuri");
        finlList.add("Halil");
        finlList.add("Ögeday");
        finlList.add("Kudret");
        finlList.add("Serdar");
    }


    public List<String> getImmutableList() {
        List<String> immutableList = new ArrayList<>();
        finlList.forEach(item -> immutableList.add(item));
        return immutableList;
    }
}
