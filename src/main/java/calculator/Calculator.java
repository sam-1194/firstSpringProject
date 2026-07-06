package calculator;

import java.util.Scanner;

public class Calculator {

	public static void Main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter value 1: ");
		float a = scanner.nextFloat();

		System.out.print("Please enter value 2: ");
		float b = scanner.nextFloat();

		System.out.print("Select an oparator (+, -, *, /)");
		String oparatorType = scanner.next();

		float finalResult = 0;

		if (oparatorType.equals("+")) {
			finalResult = addition(a, b);
		} else if (oparatorType.equals("-")) {
			finalResult = subtraction(a, b);
		} else if (oparatorType.equals("*")) {
			finalResult = multiplication(a, b);
		} else if (oparatorType.equals("/")) {
			finalResult = division(a, b);
		} else {
			System.out.println("Invalid operator");
			scanner.close();
			return;
		}

		System.out.println(finalResult);

		scanner.close();
	}

	private static float addition(float firstVal, float secondVal) {
		return firstVal + secondVal;
	}
	private static float subtraction(float firstVal, float secondVal) {
		return firstVal - secondVal;
	}
	private static float multiplication(float firstVal, float secondVal) {
		return firstVal * secondVal;
	}
	private static float division(float firstVal, float secondVal) {
		return firstVal / secondVal;
	}
}