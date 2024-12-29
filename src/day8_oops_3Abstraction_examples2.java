abstract class workdetails{
    abstract void offdetails(String id,int login);
        }
        class totdet extends workdetails{
    void offdetails(String id,int login){
        System.out.println(id+login);
    }
    void personal_details(String read_hr,int sleeping_hr){
        System.out.println(read_hr+sleeping_hr);
    }
    totdet(String name,int age){
        System.out.println(name+" "+age);
    }
        }

public class day8_oops_3Abstraction_examples2 {
    public static void main(String[] args) {
        totdet t = new totdet("naveen  ",12);
        t.offdetails("1212  ",121);
        t.personal_details("1 ",8);
    }
}
