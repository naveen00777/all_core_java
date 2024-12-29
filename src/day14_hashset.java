import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class day14_hashset {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Apple");//no duplicate value is stored again
        fruits.add("papaya");
        System.out.println(fruits);
    }
}
