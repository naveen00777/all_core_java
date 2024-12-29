//class dog{
//    String name = "jimmy";
//    int age  = 2;
//    String color= "black";
//}
class car{
    String name = "fortuner";
    String color = "white";
    int price = 3200000;
    String fuel = "petrol";
}
class phone{
    String name = "samsung";
    String color = "midnight black";
    String processor = "snapdragon 8 elite";
    int ram = 12;
    int rom = 512;
    int price = 120000;
}
class bike{
    String name = "harley davidson";
    String color = "stree black";
    int price = 1100000;
    String fuel = "petrol";
    int cc = 220;
}
public class day5_2oops {
    public static void main(String[] args) {
//        dog d = new dog();
//        dog e = new dog();
//        System.out.println(d.name);
//        System.out.println(d.age);
//        System.out.println(d.color);
//        System.out.println("----------------------");
//        System.out.println(d.name="tony");
//        System.out.println(d.age=12);
//        System.out.println(d.color="brown");------------------
        bike b = new bike();
        car c = new car();
        phone p = new phone();
        System.out.println(b.name +"\n"+ b.color+"\n"+ b.price+"\n"+b.cc+"\n"+b.fuel);
        System.out.println("============");
        System.out.println(c.name+"\n"+c.color+"\n"+c.fuel+"\n"+c.price);
        System.out.println("================");
        System.out.println(p.name+"\n"+p.color+"\n"+p.processor+"\n"+p.ram+"\n"+p.rom+"\n"+p.price);
    }
}
