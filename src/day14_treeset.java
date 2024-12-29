import java.util.Set;
import java.util.TreeSet;
public class day14_treeset {
    public static void main(String[] args) {
        Set<Integer> datas = new TreeSet<>();//sorted data
        datas.add(12);
        datas.add(13);
        datas.add(1);
        datas.add(4);
        System.out.println(datas);
        datas.remove(13);
        System.out.println(datas);
    }
}
