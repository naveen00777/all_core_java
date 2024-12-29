class constructor{
    constructor(){//no args constructor
        System.out.println("constructor block executed");
    }
    public void meth(){
        System.out.println("method block");
    }
//    constructor(int a,int b){//args constructor
//        System.out.println(a+b);
//    }
}
public class day6_1_constructors {
    public static void main(String[] args) {
//        constructor c=new constructor(3,6);//args constr calling method

        constructor c = new constructor();//no args calling method
        c.meth();
    }
}
