//class a{
//  public void hai(){
//          System.out.print("allu");
//      }
//}
//class b extends a{
//    public void hello() {
//        System.out.println(" arjun");
//    }
//}--------------------------
//class dog {
//    public void details1(String name, String color, String breed) {
//        System.out.println(name + color + breed);
//    }
//}
//    class puppy extends dog {
//        public void details2(String name, String color, String breed, String gender) {
//            System.out.println(name + color + breed);
//        }
//    }--------------------------
//class car1{
// void car1(String color,int no_of_vehicles){
//     System.out.println(color+ no_of_vehicles);
// }
// public void det1(int price,String fuel_type){
//        System.out.println(price+fuel_type);
//    }
//
//}
//class bmw extends car1{
//    void bmw1(int price,String color){
//        System.out.println(price+color);
//    }
//    void det2(String model, String color){
//        System.out.println(model+color);
//    }
//}-------------------------
//class animal{//multiple inheritance
//    void d1(String color,String type_of_breed){
//        System.out.println(color+ type_of_breed);
//    }
//}
//class dog3 extends animal{
//    void d2(String name,String breed,String color){
//    System.out.println(name+breed+color);
//}}
//class puppy2 extends dog3{
//    void d3(String name,String breed,String color,String gender){
//    System.out.println(name+breed+color+gender);
//}}--------------------------------
//class A{void m1(){
//    System.out.println("m1 in a");
//}}
//class B extends A{void m2(){
//    System.out.println("m2 in b");
//}}
//class C extends A{void m3(){
//    System.out.println("m3 in c");
//}}----------------------------
//class food{
//    void m1(String type_of_food,String name,int rating){
//        System.out.println(type_of_food+name+rating);
//    }
//}
//class f1 extends food{
//    void m2(String name,String rice,int Quantity){
//        System.out.println(name+rice+Quantity);
//    }
//}
//class f2 extends food{
//    void m3(String name,int price,int Quantity){
//        System.out.println(name+price+" "+Quantity);
//    }
//}
public class day7_oops_1inheritance {
    public static void main(String[] args) {
//        b e = new b();
//        e.hai();
//        e.hello();-------------------
//        puppy p = new puppy();
//        p.details1("jimmy  ","brown  ","golden retriever");
//        p.details2("snoopy  ","black  ","husky  ","male");
//        --------------------------
            //bmw b = new bmw();
            //b.det2("c-class","   orange");
            //b.det1(121212232,"     petrol");
            //b.car1("black   ",12);
            //b.bmw1(11112212,"  grey");
            // ------------------
//            puppy2 n = new puppy2();
//            n.d1("blue "," goldenretriever");
//            n.d2("jipsy "," husky "," red");
//            n.d3("scoopy  ","rotwheiler "," black "," female");
//        --------------------------
//        B b = new B();
//        C c = new C();
//        b.m1();b.m2();
//        c.m1();c.m3();
//        -------------
//        f1 a = new f1();
//        f2 b = new f2();
//        a.m2("biryani "," basmathi ",22);
//        a.m1("asian "," pulav ",5);
//        b.m3("noodles ",340,+1);
//        b.m1("asian "," pulav   ",4);
    }
}