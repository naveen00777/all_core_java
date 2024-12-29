//class test2 {
//    public String s1(String name, int age1, String branch1){
//      return name + age1 + branch1;
//    }
//    public String s2(String name2, int age2, String branch2, int rollno2){
//        return name2 + age2 + branch2 + rollno2;
//    }
//    public String t1(String name3, int age3){
//        return name3 + age3;
//    }
//}
//
public class day5_4methodsexample {
//    public static void main(String[] args) {
//        test2 w = new test2();
//        System.out.println(w.s1("naveen  ",+23  ,"  ece"));
//        System.out.println(w.s2("nanda  ",22,"  ece  ",93));
//        System.out.println(w.t1("manjunath  ",44));
//    }


    public static void main(String[] args) {
        test2 t = new test2();
        System.out.println(t.company(" salaar  ",22,+ 400000,"  carmechanic  "));
        System.out.println(t.deptment("coal mine   ",007,43435,23232323));
    }
}

class test2 {
    public String company(String Ename, int eid , int esalary , String erole) {

        return Ename + eid + esalary + erole;
    }

    public String deptment(String dname, int did, int no_of_emp, long dept_ph_no) {
        return dname + did + no_of_emp + dept_ph_no;
    }
}