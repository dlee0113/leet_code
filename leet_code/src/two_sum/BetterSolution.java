package two_sum;

import java.util.HashMap;

// http://www.programcreek.com/2012/12/leetcode-solution-of-two-sum-in-java/
// https://leetcode.com/discuss/19298/very-short-and-simple-java-code-for-two-sum
public class BetterSolution {
	public int[] twoSum(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for (int i = 0; i < numbers.length; i++) {
			// if map contains the number, two numbers for sum are found
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				
				// increment index since it is not zero-based according to problem requirement
				result[0] = index + 1; // index of number used to store difference in hashmap
				result[1] = i + 1; // index of current number (difference between target and number used to find difference)
				
				break;
			} else {
				// store difference between target and current number as a key 
				// and index of current number as a value
				// target = numbers[i] + (target - numbers[i])
				map.put(target - numbers[i], i);
			}
		}

		return result;
	}
}
