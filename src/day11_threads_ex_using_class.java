class t1 extends Thread{
    public void run(){for (int i = 0;i<4;i++ ){System.out.println("CMRIT");
        try{Thread.sleep(678);}catch(Exception e){}}
    }
}class t2 extends Thread{
    public void run(){for (int i = 0;i<4;i++ ){
        System.out.println("narayana");
        try{Thread.sleep(678);}catch(Exception e){}
    }}
}class t3 extends Thread{
    public void run(){for (int i = 0;i<4;i++ ){
        System.out.println("madonna");
        try{Thread.sleep(678);}catch(Exception e){}
    }}

}

public class day11_threads_ex_using_class {
    public static void main(String[] args) {
        t1 a= new t1();
        t2 b= new t2();
        t3 c= new t3();
        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(Thread.NORM_PRIORITY);
        a.setPriority(Thread.MIN_PRIORITY);
        c.start();
        b.start();
        a.start();
    }
}
