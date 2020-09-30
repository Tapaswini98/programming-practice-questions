package easy;
import java.util.*;
public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int t =n;
        int count =0;
        while(t!=0) {
            int r = t % 10;
            t = t / 10;
            count++;
            System.out.print(r);
        }
    }
}
