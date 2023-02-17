package javasessions;

public class Day4CondtionalStatements {
//	if, else, if-elseif, nested if

	public static void main(String[] args) {

		int a = 95, b = 85, c1 = 34, d1 = 30;

		if (a > b && a > c1 && a > d1) {

			System.out.println("A is largest");
		}

		else {

			if (b > a && b > c1 && b > d1)
				System.out.println("B is laregest");
			if (c1 > a && c1 > b && c1 > d1)
				System.out.println("C is laregest");
			if (d1 > a && d1 > b && d1 > c1)
				System.out.println("D is laregest");

		}

		System.out.println(a != b);

		if (a < b) {

			System.out.println("A is less than B");
		} else {
			System.out.println("B is greater than A");
		}

		if (a == b) {
			System.out.println("A equal to B");
		} else {
			System.out.println("A is not equal");
		}

		int c = 20, d = 30;
		if (c >= d) {
			System.out.println("C not equal ");

		} else {
			System.out.println("D is greater");
		}
		///////// Nested iF//////////////////
		System.out.println("Nested iF");
		int num = 150;
		if (num >= 100) {
			System.out.println("Pass1");
			if (num < 90) {
				System.out.println("Pass2");
				if (num > 100) {
					System.out.println("Pass3");
				}

				else {
					System.out.println("Not in range");
				}
			}

			else {
				System.out.println("gradeb");
			}
		} else {
			System.out.println("failed");
		}

//		if if if else/////////
		String brw = "mf";
		if (brw.equals("gc")) {
			System.out.println("launch gc");
		} else {

			System.out.println("No brw found");
		}

		if (brw.equals("ie")) {
			System.out.println("launch ie");
		}

		if (brw.equals("mf")) {
			System.out.println("launch mf");
		}

		if (brw.equals("op")) {
			System.out.println("launch op");
		}

		else {

			System.out.println("No brw found");
		}

/////////if - elseif/////////////
		String browser = "op";
		if (browser.equals("gc")) {
			System.out.println("launch gc");
		}

		else if (browser.equals("ie")) {
			System.out.println("launch ie");

		}

		else if (browser.equals("mf")) {
			System.out.println("launch mf");
		}

		else if (browser.equals("op")) {
			System.out.println("launch op");

		}

		else {
			System.out.println("No browser found");
		}

		String x = "1", y = "2", z = "9";
		boolean test = true;

		if (x.equals("1")) {

			System.out.println("X True");
		}

		if (y.equals("8")) {
			System.out.println("Y True");
		}

		if (z.equals("1")) {
			System.out.println("Z True");

		} else {
			System.out.println("False");
		}

	}
}
