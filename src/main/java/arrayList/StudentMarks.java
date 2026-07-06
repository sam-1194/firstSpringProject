package arrayList;

import java.util.ArrayList;

public class StudentMarks {

	public StudentMarks() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Integer> marks = new ArrayList<Integer>();

		marks.add(75);
		marks.add(35);
		marks.add(90);
		marks.add(60);
		marks.add(20);
		marks.remove(marks.size() - 3);
		marks.remove(marks.size() - 3);
		
		System.out.println("All Student Marks:");
		for (int i = 0; i < marks.size(); i++) {
			System.out.println("Student " + (i + 1) + ": " + marks.get(i));
		}
	}

}
