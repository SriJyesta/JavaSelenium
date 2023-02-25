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
		if (marks > 0) {
			System.out.println("Print result :" + marks);
		}

		//
//			WAP to book the specific type of car from the Uber app using Switch - Case. 
		//
//			Car Type: Mini, Sedan, SUV, Premium
		//
//			If user passes wrong car type, print please select the right car type
		//
//			WAP to launch browsers using If-ElseIf and Switch Case.
		//
//			Browser: Chrome/Firefox/IE/Safari
		//
//			If user passes wrong browser, print please pass the right browser name
		//
//			WAP to define the interest rate on the basis of Loan type using Switch Case
		//
//			Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan
		//
//			For Housing Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR Housing Loan

//		WAP to run your test cases in a specific environment like: QA, Stage, Dev, UAT, Prod using using Switch - Case
		String test = "PROD";
//		switch (test) {
//
//		case "QA":
//			System.out.println("QA Env");

		if (test.equals("QA") || test.equals("PROD") || test.equals("UAT") || test.equals("DEV")) {

			System.out.println("Running in :" + test);

		}

//			break;

//		default:
		else {
			System.out.println("Running in invalid:" + test);
		}

//			break;
	}

}

//}
