package ifConditions;

public class ElseIfCondition {

	public static void main(String args[]) {

		int marks = 90;

		if (marks >= 90) {
			if (marks >= 95) {
				System.out.println("Grade A+");
				return ;
			}
			
			System.out.println("Grade A");
		} else if (marks >= 70) {
			System.out.println("Grade B");
		} else if (marks >= 50) {
			System.out.println("Grade C");
		} else {
			System.out.println("Fail");
		}
	}
}