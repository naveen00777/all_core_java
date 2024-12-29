public class day2_operators {
    public static void main(String[] args) {
        //arthematic operator
        int a=20;
        int b = 15;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println("Addition = "+c+", subtraction = "+d + ", multiplication = "+e+", division = "+f
        +", modulus = "+g+"." );
        System.out.println("-------------------");
        //relational operator
        int h=15;
        int i = 15;
        int j=10;
        System.out.println("answer "+(h==i));
        System.out.println("answer "+(i>j));
        System.out.println("answer "+(h<j));
        System.out.println("answer "+(i!=j));
        System.out.println("answer "+(i>=j));
        System.out.println("answer "+(i<=j));
        System.out.println("-------------------");
        //relational using string
           String z="ramu";
           String y="rahi";
           System.out.println(z==y);
           System.out.println(z!=y);
        System.out.println("-------------------");
           //logical

        System.out.println((h==i)&&(h!=j));
        System.out.println((h==i)||(h!=j));
        System.out.println(!(h!=j));
        System.out.println("-------------------");
        //bitwise operator

        int n=5;
        int o=4;
        System.out.println(n&b);
        System.out.println(n|o);
        System.out.println(n^o);
        System.out.println(~n);
        System.out.println("-------------------");
        //shift operator
        System.out.println(a<<2);
        System.out.println(a>>2);
        System.out.println("-------------------");

        //example
        int x=22;
        int m=96;

        System.out.println(x|m);//118
        System.out.println(x&m);//0
        System.out.println(x>>2);//5
        System.out.println(x<<2);//88
        System.out.println(~m);//-97
        System.out.println("-------------------");
        //assignment operators

        System.out.println(a+=10);
        System.out.println(a-=10);
        System.out.println(a*=10);
        System.out.println(a/=10);
        System.out.println(a%=10);
        System.out.println(a<<=10);
        System.out.println(a>>=10);
        System.out.println(a&=10);
        System.out.println(a^=10);
        System.out.println("-------------------");
        //task----------


    }
}
