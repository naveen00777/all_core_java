import java.util.LinkedList;
import java.util.Queue;

public class day14_queues {
    public static void main(String[] args) {
        Queue<String> qu = new LinkedList<>();
        qu.offer("naveen");//add elements
        qu.offer("deva");
        qu.offer("dianosour");
        qu.offer("art");
        System.out.println(qu);
        qu.poll();//removes the element
        System.out.println(qu);
        System.out.println("front element: "+qu.peek());//shows the data present
        qu.offer("naveen");
        System.out.println(qu);
    }
}
