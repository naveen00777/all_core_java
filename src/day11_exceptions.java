public class day11_exceptions {
    public static void main(String[] args) {
        int[] arr= new int[4];
        int a = 8;
        int b = 2;
        try{
            System.out.println(a/b);
            for(int i = 0;i<=4;i++){
                System.out.println(arr[i+1]);
            }
        }
        catch(ArithmeticException e){
            System.out.println("divide by zero is not applicable");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("the given array is out of the given length");
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("the end");
        }
    }
}
