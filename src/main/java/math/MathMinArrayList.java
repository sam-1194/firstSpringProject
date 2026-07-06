package math;

import java.util.ArrayList;

public class MathMinArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> number = new ArrayList<>();

		number.add(-5);
		number.add(6);
		number.add(11);
		number.add(0);

		int max = number.get(0);

		for (int i = 1; i < number.size(); i++) {
			if (number.get(i) > max) {
				max = number.get(i);
			}
		}
		System.out.println("Maximum value is:" + max);

	}

	static String myMethod() {
		return "Sam";
	}

	String nonStatic() {
		return "Non Static";
	}

}
