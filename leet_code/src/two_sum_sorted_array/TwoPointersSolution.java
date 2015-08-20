package two_sum_sorted_array;

import java.util.Arrays;

public class TwoPointersSolution {
	public static int[] twoSum(int[] numbers, int target) {
		// Assume input is already sorted.
		int i = 0, j = numbers.length - 1;
		while (i < j) {
			int sum = numbers[i] + numbers[j];
			if (sum < target) {
				i++;
			} else if (sum > target) {
				j--;
			} else {
				return new int[] { i + 1, j + 1 };
			}
		}
		
		throw new IllegalArgumentException("No two sum solution");
	}
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(twoSum(numbers, 7)));
	}
}
