package myMethods;

public class MyMethod2 {
	public static void main(String[] args) {
		int x = 10;
		{
			int y = 20;
//			System.out.println(x + y); // OK
		}
//		System.out.println(y); // Error if you try this
	}
}
