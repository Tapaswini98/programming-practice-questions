package easy;
import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt(); //enter the total number

        for(int i = 0; i < t; i++){
            int n = scn.nextInt(); //enter the number to print whether it is prime or not.

            int div = 2;
            while(div * div <= n){
                if(n % div == 0){
                    break;
                }
                div++;
            }

            if(div * div > n){
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }


}
