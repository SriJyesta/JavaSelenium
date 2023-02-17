package javasessions;

public class Day6LoopsWhileandFor {

	public static void main(String[] args) {
		int i = 1;

		while (i <= 10) {
			System.out.println(i);
			++i;
			i++;
			break;

		}
		int k = 1;

		while (true) {

			System.out.println("Hello World");
			if (k == 100) {

				break;

			}

			k++;

		}
		int i1 = 1;

		while (i1 <= 1) {

			System.out.println("Hi Java");
			break;

		}

//      for (initialization; condition; increment/decrement)
		for (int j = 1; j <= 10;) {
			System.out.println(j);
			j++;
		}
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + ":" + (byte) ch);
		}

		for (int u = 1; u <= 10; u++) {
			System.out.println("I am batman:" + u);
		}

		for (int b = 10; b >= 1; --b) {

			System.out.println("h:" + b);

		}
		for (int b1 = 1; b1 <= 100; b1++) {
			++b1;
			System.out.println("Even :" + b1);

		}

		for (int b1 = 1; b1 <= 100; b1++) {
			++b1;
			System.out.println("Odd :" + (b1-1));
		}

		for (char z1 = 'a'; z1 <= 'z'; z1++) {

			if (z1 == 'a' || z1 == 'e' || z1 == 'i' || z1 == 'o' || z1 == 'u') {
				System.out.println(z1);
			}

		}

		int i7 = 1;
		while (i7 <= 10) {
			System.out.println((float) i7);
			i7++;

		}

		int i8 = 0;
		while (i8 <= 33) {
			System.out.println(i8);
			i8++;
			

		}

	}
	
//	use cases of while loop:
//	Number of iterations not fixed__example:links/images on the page
//	webtable pagination 1 2 3 4 5....next
//	web element loading on the page
//	page load time out 
//	calender/dob/future dates selection
//	
//	use cases of for loop:
//	Number of iterations  fixed__example:links/images on the page
//	month/day drop down
//	categoery options
//	Arrays Array list
//	excel file - test data -rows
//	selecting country from drop down
//	read data from DB rows/cloumns data
	

}
