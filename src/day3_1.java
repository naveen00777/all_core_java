import java.util.Scanner;
public class day3_1 {
    public static void main(String[] args) {
//        System.out.println("enter your input");
        Scanner sc =new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println("your input 1 is "+n);
//        int b = sc.nextInt();
//        System.out.println("your input 2 is "+b);
//        int k = n+b;
//        System.out.println("answer "+k);
        //----------------------------------------
        System.out.println("enter your first name");
        String fn = sc.nextLine();
        System.out.println("enter your last name");
        String ln = sc.nextLine();
        System.out.println("enter your college name");
        String clg_name = sc.nextLine();
        System.out.println("enter your branch");
        String branch = sc.nextLine();
        System.out.println("enter your USN : ");
        String usn = sc.nextLine();
        System.out.println("enter your mobile number");
        long mobile_no = sc.nextLong();
        System.out.println("Enter your age : ");
        int age = sc.nextInt();

        System.out.println(fn +" "+ln +"\n "+clg_name +"\n "+branch +"\n"+mobile_no +"\n "+age +"\n"+ usn);
    }

}
