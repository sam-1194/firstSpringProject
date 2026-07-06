package myMethods;

public class MyMethod {
	/*
	 * static void welcomeMessage() { System.out.println("Welcome to Java"); }
	 * 
	 * public static void main(String[] args) { welcomeMessage(); }
	 */

	static void myDetails(String mName, int mAge, double mPercentage) {
		System.out.println(mName + " age is sweet " + mAge + " with a percentage of " + mPercentage);
	}

	public static void main(String[] args) {

		myDetails("Sam", 16, 99.99);
		myDetails("Mohit", 14, 101);

	}
}
