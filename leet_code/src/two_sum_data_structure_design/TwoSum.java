package two_sum_data_structure_design;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	private Map<Integer, Integer> table = new HashMap<>();

	public void add(int input) {
		int count = table.containsKey(input) ? table.get(input) : 0;
		table.put(input, count + 1);
	}

	public boolean find(int val) {
		for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
			int num = entry.getKey();
			int y = val - num;
			if (y == num) {
				// For duplicates, ensure there are at least two individual
				// numbers.
				if (entry.getValue() >= 2)
					return true;
			} else if (table.containsKey(y)) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		for (Map.Entry<Integer, Integer> entry : table.entrySet()) {
			System.out.println(entry.getKey() + "," + entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		
		twoSum.add(1);
		twoSum.add(3);
		twoSum.add(5);
		
		twoSum.print();
		
		System.out.println(twoSum.find(4));
		System.out.println(twoSum.find(7));
	}
}