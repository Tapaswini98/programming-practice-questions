package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Produces product array except itself
 * For example given {1,2,3,4} prints {24,12,8,6}
 */
public class ProductOfArrayExceptSelf {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of element to be in array");
		int n = scanner.nextInt();
		int[] input = new int[n];
		System.out.println("Enter elements to the array");
		for (int i = 0; i < n; i++) {
			input[i] = scanner.nextInt();
		}

		input = getProduct(input);

		Arrays.stream(input).forEach(System.out::println);

	}

	static int[] getProduct(int[] input) {
		int N = input.length;
		int[] prod = new int[N];
		int product = 1;
		prod[0] = product;
		for (int i = 1; i < N; i++) {
			product *= input[i - 1];
			prod[i] = product;
		}

		product = 1;
		for (int i = N - 2; i >= 0; i--) {
			product *= input[i + 1];
			prod[i] *= product;
		}
		return prod;
	}

}