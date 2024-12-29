import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class day13_collections_vector {
    public static void main(String[] args) {
        List details = new Vector();
//        List<String> details = new LinkedList<String>();
        details.add(10);
        System.out.println(details);
        details.add(20);
        System.out.println(details);
        details.add(30);
        System.out.println(details);
        details.add(40);
        System.out.println(details);
        details.add(60);
        System.out.println(details);
        details.add(70);
        System.out.println(details);
        details.add(4,50);
        System.out.println(details);
        details.remove(4);
        System.out.println(details);
        details.remove(2);
        System.out.println(details);
        Collections.sort(details);
    }
}
