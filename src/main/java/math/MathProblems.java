package math;

public class MathProblems {
	public static void main(String[] args) {

		int[] numbers = { -3, 4, 10, 2, 7 };

		int max = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
//		    if (numbers[i] > max) {
//		        max = numbers[i];
//		    }
			max = Math.max(numbers[i], max);
		}

		System.out.println(max);
	}

}
