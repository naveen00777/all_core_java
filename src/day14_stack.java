import java.util.List;
import java.util.Stack;

public class day14_stack {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
//        num.add(14);
//        num.add(1);
//        num.add(4);
//        num.add(6);
//        num.add(24);
//        System.out.println(num);
//        num.remove(4);
//        System.out.println(num);
//        ------------------------
        num.push(12);
        num.push(1);
        num.push(15);
        num.push(11);
        System.out.println(num);
        num.pop();//12,1,15
        num.pop();//12,1
        System.out.println(num);
    }
}
