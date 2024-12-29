
class tre extends Thread {
    public void run(){for(int i = 0;i<4;i++){
        System.out.println("in tre block");
        try{Thread.sleep(101);}catch(Exception e){}
    }
    }
}class tres extends Thread{
    public void run(){for(int i = 0;i<4;i++){
        System.out.println("in tres block");
        try{Thread.sleep(678);}catch(Exception e){}
    }

    }
}
public class day11_threads {
    public static void main(String[] args) {
        tre t= new tre();
        tres s = new tres();
        t.start();
        s.start();
    }
}
