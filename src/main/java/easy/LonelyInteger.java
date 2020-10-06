package easy;

import java.util.Scanner;

/*
 * The programs picks the integer which occurs only once in a given array.
 * For example {1,2,3,2,1}, displays 3
 */
public class LonelyInteger {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of elements in array");

		int n = sc.nextInt();

		int[] input = new int[n];
		int index = 0;
         
		System.out.println("enter the array elements");
		
		while (n > 0) {
			input[index++] = sc.nextInt();
			n--;
		}
	    int result =0;
	    for(int i: input) {
	    	result ^= i;
	    }
        System.out.println(result);
	}

}
