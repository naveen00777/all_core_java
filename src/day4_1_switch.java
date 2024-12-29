import java.util.Scanner;
public class day4_1_switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("sunday");
//                break;
//            case 2:
//                System.out.println("monday");
//                break;
//            case 3:
//                System.out.println("tuesday");
//                break;
//            case 4:
//                System.out.println("wednesday");
//                break;
//            case 5:
//                System.out.println("thursday");
//                break;
//            case 6:
//                System.out.println("friday");
//                break;
//            case 7:
//                System.out.println("saturday");
//                break;
//            default:
//                System.out.println("not a day");
//                break;
//
//        }----------------------------------------------------
        String c = sc.nextLine();
        switch (c){
            case "A":
                System.out.println("90-100");
                break;
            case "B":
                System.out.println("80-89 ");
                break;
            case "C":
                 System.out.println("70-79");
                break;
            case "D":
                System.out.println("60-69");
                break;
            case "E":
                System.out.println("50-59");
                break;
            default:
                System.out.println("fail");
                break;
        }
    }
}
