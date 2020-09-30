package easy;

import java.util.Scanner;

public class PrimeNumberUpToALimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();//enter the lowest value
        int high = sc.nextInt();//enter the largest value
        for (int i = low; i <= high; i++) { //loop executing from low to high
            int count = 0;
            for (int j = 2; j * j <= i; j++) { //loop for checking the prime number
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(i);
            }
        }
    }
}
