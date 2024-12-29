class e1{
    e1(String name,String role,int sal,String gender){
        System.out.println(name+role+sal+gender);
        System.out.println("const1");
    }
    e1(String name,int age,String location,int experience){
        System.out.println(name+age+location+experience);
        System.out.println("const2");
    }
    void h1(String name, int id,String company_name){
        System.out.println(name + id+company_name);
        System.out.println("meth h1");
    }
    void d1(int dept_id,String dept_name,String location){
        System.out.println(dept_id+dept_name+location);
        System.out.println("meth d1");
    }
}

public class day6_3_example2 {
    public static void main(String[] args) {
e1 e = new e1("ram  "," pada ",12333,"  male");
e1 n = new e1("raju  ",32,"  bangalore  ",3);
e.h1(" martin  ",2121,"  accent ");
e.d1(121212,"  pada  ","  chennai  ");
    }
}
