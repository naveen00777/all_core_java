import java.util.ArrayList;
import java.util.Collection;

public class day13_collections_ex1 {
    public static void main(String[] args) {
        Collection<String> data  = new ArrayList<>();
        data.add("prabhas");
        data.add("alluarjun");
        data.add("nani");
        data.add("ntr");
        data.add("suriya");
        data.remove("alluarjun");
        System.out.println(data);
    }
}
