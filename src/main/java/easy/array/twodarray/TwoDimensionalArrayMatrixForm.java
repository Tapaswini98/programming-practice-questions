package easy.array.twodarray;

import java.util.Scanner;

public class TwoDimensionalArrayMatrixForm {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];

        for(int i = 0 ; i<m; i++){
            for(int j = 0 ;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0;i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
