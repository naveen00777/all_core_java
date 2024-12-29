import java.util.*;

public class day13_collections_ARRLIST {
    public static void main(String[] args) {
        List details = new ArrayList();
        details.add("name:naveen");
        details.add("location:bangalore");
        details.add("food: biryani");
        details.add("maldieves");
        details.add(4);
        details.add(23);
        details.add("singapore");
        details.add("abc");
        System.out.println(details);
        details.add(3,"raitha");
        System.out.println(details);
    }
}
