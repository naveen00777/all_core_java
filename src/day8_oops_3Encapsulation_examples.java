class student{
    private String name = "ramu";
    private String branch = "ece";
    private String rollno = "1CR20EC095";
    private String address = "bangalore";
    private int age = 12;
    public void setName(String name1){
        name = name1;
        System.out.println(name);
    }
    public void setBranch(String branch1 ){
        branch = branch1;
        System.out.println(branch);
    }
    public void setRollno(String rollno1){
        rollno = rollno1;
        System.out.println(rollno);
    }
    public void getAddress(){
        System.out.println(address);
    }
    public void getAge(){
        System.out.println(age);
    }
}

public class day8_oops_3Encapsulation_examples {
    public static void main(String[] args) {
student s = new student();
s.setName("raju");
s.setBranch("cse");
s.setRollno("1CR20CS123");
s.getAddress();
s.getAge();
    }
}
