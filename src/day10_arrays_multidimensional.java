public class day10_arrays_multidimensional {
    public static void main(String[] args) {
        int[][]mat = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        System.out.println("Enter no of elements");
        for(int i = 0;i<mat.length;i++){
            for (int j = 0 ;j<mat.length;j++){
                System.out.print(mat[i][j]+" ");
            }System.out.println();
        }
    }
}
