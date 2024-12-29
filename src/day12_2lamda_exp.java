interface i{
    void add(int a,int b);
}

public class day12_2lamda_exp {
    public static void main(String[] args) {
        i ob =(int a,int b)-> System.out.println(a+b);

        ob.add(1,5);
    }
}
