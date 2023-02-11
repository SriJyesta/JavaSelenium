package javasessions;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
////
////		Expected Output :
////
////		Hello 
////
////		Naveen K
//
//		System.out.println("1 Hello Venkat J");
//
////		2. Write a Java program to print the sum of two numbers.
////
////		Test Data:
////
////		 74 + 36 
//		int a = 74, b = 36;
//
//		System.out.println("2 Value is :" + (a + b));
//
////		3. Write a Java program to divide two numbers and print on the screen.
////
////		Test Data:
////
////		50/3
////
////		Expected 
////
////		Expected Output : 
////
////		43 
////
////		16
////
////		19 
////
////		13
//
//		int a1 = 50, b1 = 3;
//
//		System.out.println("3 Short Value is :" + (int) a1 / b1);
//		System.out.println("3 Short Value is :" + (float) a1 / b1);
//		System.out.println("3 Short Value is :" + (double) a1 / b1);
//		System.out.println("3 Short Value is :" + (short) a1 / b1);
//
////
////		4. Write a Java program to compute the specified expressions and print the output. Go to the editor
////
////		Test Data:
////
////		((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
////
////		Expected Output
////
////		2.138888888888889
//
//		double a2 = 25.5, b2 = 3.5, c2 = 40.5, d2 = 4.5;
//		System.out.println("4 Value is :" + (a2 * b2 - b2 * b2) / (c2 - d2));
//
////		5. Try to concat "Hello Selenium" with a character 't'.
//
//		String con = "Hello Selenium", con1 = "T";
//		System.out.println("5 Value is :" + con + con1);
//
////		6. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : 
////
////		"Your Total amount is. 3700".
//
//		int x = 100, y = 200, z = 3400;
//		System.out.println("6 Your Total amount is :" + (x + y + z));
////
////		Print the ASCII value of the character 'h'.
//		
//		int t='h';
//		System.out.println("ASCII is :" + t);
////
////		Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
//		
//		int u='d';
//		System.out.println("ASCII is :" + (u+3));
////		Write a program to find the square of the number 3.9.
//		float j=3.9f;
//		System.out.println("Value  is :" + (j*2));

		System.out.println("-----------Increment decrement task---------");

		int i = 11;

		i = i++ + ++i;// 11+13

		System.out.println(i);// 24

		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;// c:103,a=13,b=24
//		     11+22+11+22+13+24

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		int i1 = 0;

		int x = i1++ - --i1 + ++i1 - i1--;
		// 0-0+1-1

		System.out.println(x);
		System.out.println(i1);

		int i3 = 1, j = 2, k = 3;
		int m = i3-- - j-- - k--;
		// 1-2-3
		System.out.println("i=" + i3);// 0
		System.out.println("j=" + j);// 1
		System.out.println("k=" + k);// 2
		System.out.println("m=" + m);// -4

		int a1 = 1, b2 = 2;
//		System.out.println(--b2);
		System.out.println(--b2 - ++a1 + ++b2 - --a1);// 1-2+2-1=-1+1

		int i4 = 19, j3 = 29, k3;
		k3 = i4-- - i4++ + --j3 - ++j3 + --i4 - j3-- + ++i4 - j3++;
//		     19-18+28-29+18-29+19-28

		System.out.println("i=" + i4);// 19
		System.out.println("j=" + j3);// 29
		System.out.println("k=" + k3);// -20

		int m1 = 0, n = 0;
		int p = --m1 * --n * n-- * m1--;// -1*-1*-1*-1
		// -1*-1*-1*-1
		System.out.println(p);// 1
		System.out.println(m1);// -2

		int a4 = 1;
		int a6 = a4++ + ++a4 * --a4 - a4--;
		// a4=1

		// 1+3*2-2=1+6-2=7-2=5
//		System.out.println(a4);
		System.out.println(a6);
		System.out.println(a4);

		int a9 = 'A';
		System.out.println(++a9);

		double d = 1.5, D = 2.5;
		System.out.println(d++ + ++D);//1.5+3.5=5
		System.out.println(d);//2.5
		
		
		
		
	}

}
