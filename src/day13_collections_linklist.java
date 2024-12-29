import java.util.LinkedList;
import java.util.List;

public class day13_collections_linklist {
    public static void main(String[] args) {
        List details = new LinkedList();
//        List<String> details = new LinkedList<String>();
        details.add("naveen");
        System.out.println(details);
        details.add("kumar");
        System.out.println(details);
        details.add("madonna");
        System.out.println(details);
        details.add("narayana");
        System.out.println(details);
        details.add("CMRIT");
        System.out.println(details);
        details.add("1CR20EC095");
        System.out.println(details);
        details.add(5,"ece");
        System.out.println(details);
        details.remove("madonna");
        System.out.println(details);
        details.remove(2);
        System.out.println(details);



    }
}
