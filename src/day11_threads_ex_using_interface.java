class inter1 implements Runnable{
    public void run(){
        System.out.println("inter1 block");
        try{Thread.sleep(678);}catch(Exception e){}}
    }
class inter2 implements Runnable{
    public void run(){
        System.out.println("inter2 block");
        try{Thread.sleep(678);}catch(Exception e){}
    }
}
class inter3 implements Runnable{
    public void run(){
        System.out.println("inter3 block");
        try{Thread.sleep(678);}catch(Exception e){}
    }
}
public class day11_threads_ex_using_interface {
    public static void main(String[] args) {
        inter1 k = new inter1();
        inter2 l = new inter2();
        inter3 m = new inter3();
        Thread t1 = new Thread(k);//creating a new thread class because object will not be created
        Thread t2 = new Thread(l);//in  the interface method keeping it as a reference class
        Thread t3 = new Thread(m);
        t1.run();
        t2.run();
        t3.run();

    }
}
