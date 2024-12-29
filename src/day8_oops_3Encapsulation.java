class person{
   private String name = "raju";
    private int age = 12;
//    void getAge(){//getter method
//        System.out.println(age);
//    }void getName(){
//        System.out.println(name);
//    }
//    ----------------------------
    void setName(String name1){
        name = name1;
        System.out.println(name1);
    }void setAge(int age1){
        age = age1;
        System.out.println(age1);
    }
}

public class day8_oops_3Encapsulation {
    public static void main(String[] args) {
         person p = new person();
//         p.getName();//getter method
//         p.getAge();
        p.setName("abhay");
        p.setAge(14);
    }
}
 