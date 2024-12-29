interface person1{
    public void boy();
    public void girl();
}class boy implements person1{
    public void boy(){
        System.out.println("it is a boy1");
    }
    public void girl(){
        System.out.println("it is a girl1");
    }
}class girl implements person1{
    public void boy(){
        System.out.println("it is a boy2");
    }
    public void girl(){
        System.out.println("it is a girl2");
    }
}
public class day9_interface_hierarchical_interface {
    public static void main(String[] args) {
        boy b = new boy();
        girl g  = new girl();
        b.boy();
        g.boy();
        b.girl();
        g.girl();

    }
}
