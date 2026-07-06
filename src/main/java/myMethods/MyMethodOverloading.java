package myMethods;

public class MyMethodOverloading {
	static int MyMethodOver(int x, int y) {
		return x + y;
	}

	static double MyMethodOver(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
//		int myNum1 = MyMethodOver(8, 5);
//		double myNum2 = MyMethodOver(4.3, 6.26);
//		System.out.println("int: " + myNum1);
//		System.out.println("double: " + myNum2);

		rec(1);
	}

	static void rec(int a) {
		if (a <= 10) {
			System.out.println(a);
			rec(++a);
		}
	}
}