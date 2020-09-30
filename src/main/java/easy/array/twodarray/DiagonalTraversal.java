package easy.array.twodarray;
import java.util.*;
public class DiagonalTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ;i++)
        {
            for(int j = 0 ;j < n ;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int g = 0; g < arr.length; g++){
            for(int i = 0, j = i + g; j < arr.length; i++, j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
