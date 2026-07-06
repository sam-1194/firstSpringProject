package map;

import java.util.ArrayList;

// Reverse an Array: Write a function to reverse the elements in-place.
// INPUT: [1, 2, 3, 4, 5]
// OUTPUT: [5, 4, 3, 2, 1]

public class ReverseArrau {

	public static void main(String[] args) {

		ArrayList<Integer> val = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		val.add(1);
		val.add(2);
		val.add(2);
		val.add(4);
		val.add(6);

		for (int i = val.size(); i <= val.size() && i > 0; i--) {
			result.add(val.get(i - 1));
		}

		System.out.println(result);
	}

}
