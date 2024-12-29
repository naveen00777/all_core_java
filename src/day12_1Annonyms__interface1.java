interface e{
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}

public class day12_1Annonyms__interface1 {
    public static void main(String[] args) {
        e a = new e(){
            public void add(int a, int b){
                System.out.println(a+b);
            }public void sub(int a, int b){
                System.out.println(a-b);
            }public void mul(int a, int b){
                System.out.println(a*b);
            }public void div(int a, int b){
                System.out.println(a/b);
            }
        };
        a.add(4,6);
        a.sub(8,6);
        a.mul(8,6);
        a.div(8,6);

    }
}
