    import java.util.Scanner;
    public class day3_2if {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//            int age = sc.nextInt();
//            if(age>=18){
//                System.out.println("eligible to vote");
//            }else{
//                System.out.println("not eligible to vote");
//            }--------------------------------
//            System.out.println("Enter a number");
//            int n = sc.nextInt();
//            if(n%2==0){
//                System.out.println("even number");
//            }else{
//                System.out.println("odd number");
//            }---------------------------------------
//            System.out.println("enter your class grade");
//                int standard = sc.nextInt();
//
//                if(standard>0 && standard<=3){
//                    System.out.println("primary class");
//                }else if (standard>=4 && standard<=7) {
//                    System.out.println("secondary class");
//                }
//                else if (standard>=8 && standard<=10) {
//                    System.out.println("high school");
//                }else{
//                    System.out.println("you are not in school");
//                }---------------------------------------
//            System.out.println("enter value of a");
//            int a = sc.nextInt();
//            System.out.println("enter value of b");
//            int b = sc.nextInt();
//            System.out.println("enter value of c");
//            int c = sc.nextInt();
//            if(a==b && b==c){
//                System.out.println("all are equal");
//            }else{
//                if(a>=b){
//                    if(a>=c){
//                        System.out.println(a+" is largest");
//                    }else{
//                        System.out.println(c+ " is largest");
//                    }
//                }else{
//                    if(b>=c){
//                        System.out.println(b+" is largest");
//                    }else{
//                        System.out.println(c+" is largest");
//                    }
//                }}--------------------------------
//            System.out.println("enter your percentage");
//          int grade = sc.nextInt();
//                if(grade <=0){
//                    System.out.println("no grade");
//                }else{
//                    if(grade>60){
//                        if(grade>=85&& grade<=100) {
//                        System.out.println("distinction");
//                        }else{
//                            System.out.println("first class");
//                        }
//                    }else{
//                        if(grade>=35 && grade<60){
//                            System.out.println("Second class");
//                        }else{
//                            System.out.println("fail");
//                        }
//
//                    }
//                }
            int year = sc.nextInt();
            if(year%4==0 && year%100!=0 || year%400==0){
                System.out.println("its a leap year");
            }else{
                System.out.println("not a leap year");
            }
        }
    }
