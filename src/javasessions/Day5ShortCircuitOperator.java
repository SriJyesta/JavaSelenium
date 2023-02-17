package javasessions;

public class Day5ShortCircuitOperator {

	public static void main(String[] args) {

//		&& is short circuit operator

//		In Java, the short-circuit operators are "&&" (logical AND) and "||" (logical OR). 
//		They are called short-circuit operators because they can quickly determine the result 
//		of a logical expression without evaluating the entire expression.
//
//		For example, in the expression "a && b", if "a" is false, 
//		then the entire expression will be false regardless of the value of "b", 
//		so "b" will not be evaluated. Similarly, in the expression "a || b", 
//		if "a" is true, then the entire expression will be true regardless of 
//		the value of "b", so "b" will not be evaluated.

		int a = 100, b = 90, c = 80;
		if (a > b || a < c) { //true false= true 
			System.out.println("A is largest");

		}

		if (a > b && a > c && a<b) {//true false=false
			System.out.println("B is largest");
		} else {
			System.out.println("C is largest");
		}
	}

}
