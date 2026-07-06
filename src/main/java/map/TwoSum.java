package map;

import java.util.ArrayList;

public class TwoSum {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		nums.add(2);
		nums.add(2);
		nums.add(2);
		nums.add(7);
		nums.add(11);
		nums.add(15);

		for (int i = 0; i < nums.size(); i++) {
			for (int j = i + 1; j < nums.size(); j++) {

				int startIndex = nums.get(i);
				int endIndex = nums.get(j);

				if ((startIndex + endIndex) == 18) {
					result.add(nums.indexOf(startIndex));
					result.add(nums.indexOf(endIndex));
					break;
				}
			}
		}

		System.out.println(result);
	}
}
