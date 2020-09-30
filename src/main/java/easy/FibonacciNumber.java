package easy;
import  java.util.*;
public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        int i =0;
        while(i < n){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
            i++;
        }
        /**
        for(int i = 0; i < n; i++){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
         **/
    }
}
