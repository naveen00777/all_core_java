@FunctionalInterface
interface i4{
    int mul(int a,int b,int c);
}

public class day12_2lamda_ex4 {
    public static void main(String[] args) {
        i4 i = ((int a,int b,int c)-> (a*b*c));
       int result =  i.mul(3,5,7);
        System.out.println(result);
    }
}
