package javasessions;

public class Day4SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String brwser = "  GC  ";
		int a = 1;

		switch (brwser) {
		case "gc":
			System.out.println("launch gc");

			if (a < 10) {
				System.out.println("A is lowest value");
			}

			break;

		case "ie":
			System.out.println("launch ie");
			break;

		case "mf":
			System.out.println("launch mf");
			break;

		case "me":
			System.out.println("launch me");
			break;

		default:
			System.out.println("Not an valid brwser");
			break;

		case "opera":
			System.out.println("launch me");
			break;
		}

		String stname = "R";
		int marks = 0;

		switch (stname) {
		case "Sri":
			System.out.println("Sri Passed");
			marks = 100;
			break;

		case "Rc":
			System.out.println("Rc Passed");
			marks = 100;
			break;

		case "Jyesta":
			System.out.println("Jyesta Passed");
			marks = 100;
			break;

		default:
			System.out.println("Invalid result");
			break;
		}

		System.out.println(marks);
		if(marks>0) {
			System.out.println("Print result :" +marks);
		}

	}

}
