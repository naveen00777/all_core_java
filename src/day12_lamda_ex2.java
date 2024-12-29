@FunctionalInterface
interface iw{
    int add(int a,int b);
}

public class day12_lamda_ex2 {//without return

    public static void main(String[] args) {
        iw e =(a,b) -> (a+b);
        int res = e.add(1,7);
        System.out.println(res);

        }
    }
