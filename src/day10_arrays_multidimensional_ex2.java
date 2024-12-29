import java.util.Scanner;

public class day10_arrays_multidimensional_ex2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter no of rows ");
            int row = sc.nextInt();
            System.out.println("Enter no of cols ");
            int col = sc.nextInt();
            int mat1[][] = new int[row][col];
            int mat2[][] = new int[row][col];
            int mul[][] = new int[row][col];

            System.out.println("Enter elements of matrix1");
            for(int i = 0;i<row;i++){
                for (int j = 0;j<col;j++){
                    mat1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter elements of matrix2");
            for(int i = 0;i<row;i++){
                for (int j = 0;j<col;j++){
                    mat2[i][j] = sc.nextInt();
                }
            }
            for(int i = 0;i<row;i++){
                for (int j = 0;j<col;j++){
                    for(int k = 0;k<col;k++){
                        mul[i][j] = mul[i][j]+ mat1[i][k]*mat2[k][j];
                    }
                }
            }
            System.out.println("the final sum of matrices is ");
            for(int i = 0;i<row;i++){
                for (int j = 0;j<col;j++){
                    System.out.print(mul[i][j]+"   ");
                }
                System.out.println();
            }
        }
    }

