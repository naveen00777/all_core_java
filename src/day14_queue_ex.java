import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class day14_queue_ex {
    public static void main(String[] args) {
//        Queue<Integer> name = new PriorityQueue<>();
//        name.offer(3);
//        System.out.println(name);
//        name.offer(8);
//        name.offer(4);
//        name.offer(1);
//        name.offer(12);
//        System.out.println(name);
//        name.poll();
//        System.out.println(name);
//        System.out.println("first data in priorityQueue: "+name.peek());
        //-------------------------------------
//        Queue<Integer> name = new ArrayDeque<>();
//        name.offer(3);
//        System.out.println(name);
//        name.offer(8);
//        name.offer(4);
//        name.offer(1);
//        name.offer(12);
//        System.out.println(name);
//        name.poll();
//        System.out.println(name);
//        System.out.println("first data in ArrayQueue: "+name.peek());
        //-----------------------------------
        Queue<Integer> name = new LinkedList<>();
        name.offer(3);
        System.out.println(name);
        name.offer(8);
        name.offer(4);
        name.offer(1);
        name.offer(12);
        System.out.println(name);
        name.poll();
        System.out.println(name);
        System.out.println("first data in linked list: "+name.peek());


    }
}
