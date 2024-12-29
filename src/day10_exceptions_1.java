public class day10_exceptions_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int y =a/b;
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
