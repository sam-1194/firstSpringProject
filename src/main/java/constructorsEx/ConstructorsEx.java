package constructorsEx;

public class ConstructorsEx {
	int age;
	String name;
	float percentage;

	public ConstructorsEx(int age, String myName, float myPercentage) {
		this.age = age;
		this.name = myName;
		this.percentage = myPercentage;

	}

	public static void main(String[] args) {
		ConstructorsEx myObj = new ConstructorsEx(16, "Sam", 75.55f);
		System.out.println(
				"My name is " + myObj.name + " and my age is sweet " + myObj.age + " and I got " + myObj.percentage);
	}

}
