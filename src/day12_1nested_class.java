class w{
    public void add(){
        System.out.println("in Addition block");
    }class x{
        public void sub(){
            System.out.println("in nested subtraction block");
        }
    }
}

public class day12_1nested_class {
    public static void main(String[] args) {
        w a = new w();
        w.x b=a.new x();
        a.add();
        b.sub();
    }
}
