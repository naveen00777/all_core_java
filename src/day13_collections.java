import java.util.ArrayList;
import java.util.Collection;

public class day13_collections {
    public static void main(String[] args){
        Collection number  = new ArrayList();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.remove(20);

        System.out.println(number);
    }
}
