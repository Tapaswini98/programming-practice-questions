package easy.array.twodarray;
import java.util.*;
public class SearchInTwoDimensionalArray {
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

        int num = sc.nextInt();

        int i = 0;
        int j = arr[0].length - 1;

        while(i < arr.length  && j> 0){
            if(num == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }
            else if(num <arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Not found");
    }
}
