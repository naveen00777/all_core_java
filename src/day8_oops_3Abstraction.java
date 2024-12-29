abstract class shape{
    abstract void draw();
}class a extends shape{
    void draw(){
        System.out.println("it is a circle");
    }
}
public class day8_oops_3Abstraction {
    public static void main(String[] args) {
        a x =new a();
        x.draw();
    }
}
