package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// print triangle order
// 
// 
/**
 * INPUT: [1, 2, 3, 4, 5] OUTPUT: 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
 */
/**
 * public class Triangle {
 * 
 * public static void main(String[] args) {
 * 
 * List<Integer> input = Arrays.asList(1, 2, 3, 4, 10); triangle2(input); }
 * 
 * private static void triangle2(List numbers) { for (int i = 0; i <=
 * numbers.size(); i++) { for (int j = 0; j <= i; j++) { System.out.print("*");
 * } System.out.println(""); } }
 */
public class ReverseTriangle {

	public static void main(String[] args) {
		ArrayList<Integer> reverseInput = new ArrayList<Integer>();

		reverseInput.add(1 );
		reverseInput.add(2);
		reverseInput.add(3);
		reverseInput.add(4);
		reverseInput.add(5);

		triange(reverseInput);

	}

	public static void triange(ArrayList<Integer> args) {

		for (int i = 0; i <= args.size(); i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(args.get(i - 1));
			}
			System.out.println("");
		}
	}

}
