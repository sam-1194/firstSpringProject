package construct;

public class Construct {
	int x;

	public Construct() {
		x = 5;
	}

	public static void main(String[] args) {
		Construct myConst = new Construct();
		System.out.println(myConst.x);
		
		myConst.x = 10;
		System.out.println(myConst.x);
	}

}
