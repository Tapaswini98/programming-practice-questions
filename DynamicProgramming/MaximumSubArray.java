package DynamicProgramming;

import java.util.Scanner;
/*
* The algorithm is used to find the maximum sub array
* Example given an array{1, -3, 2, 2, -1}, maximum of sub array is 4.
*/

public class MaximumSubArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of elements in array");

		int n = sc.nextInt();

		int[] input = new int[n];
		int index = 0;

		while (n > 0) {
			input[index++] = sc.nextInt();
			n--;
		}

		int current_max = input[0];
		int global_max = input[0];

		for (int i = 1; i < input.length; i++) {
			current_max = Math.max(input[i], current_max + input[i]);
			global_max = Math.max(global_max, current_max);
		}

		System.out.println(global_max);

	}

}
