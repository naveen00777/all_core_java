public class day9_arrays_examples {
    public static void main(String[] args) {
        double[]myList = {1.2,1.9,1.3,3.2};
        for(int i = 0;i<myList.length;i++){
            System.out.println(myList[i]+" ");
        }double sum = 0;
        for(int i = 0;i<myList.length;i++){
            sum += myList[i];
        }System.out.println("sum is :"+ sum);
        }
    }

