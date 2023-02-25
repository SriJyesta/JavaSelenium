package javasessions;

import java.util.Arrays;

public class Day9ArraysConcept {

	public static void main(String[] args) {

//		Primitive data types are the 
//		basic building blocks of data in Java, and they include:
//	byte ,short,int,long,float,double,char,boolean
//

//		In addition to primitive data types, 
//		arrays can also be used with object data types, such as:
//String, Date, ArrayList, Object

		int a[] = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;

		int sum = 0;

		int len = a.length;
		System.out.println(len);
		System.out.println(a[0] + " " + a[1] + " " + a[2]);

		System.out.println("------------------------");
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i]);
			sum = sum + a[i];

			System.out.println("------------------------" + sum);

		}

		System.out.println("------------------------");
		System.out.println(Arrays.toString(a));

		String b[] = { "Sri", "", "", "Jyesta", "Rc" };
//		b[0] = "Sri";
//		b[1] = "Jyesta";
//		b[2] = "RC";

		System.out.println(Arrays.toString(b));

		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}

		double q[] = new double[3];
		q[0] = 10.44;
		q[1] = 20.05;
		q[2] = 80.25;
		double sum1 = 0;
		for (double k = 0; k < 3; k++) {
			System.out.println(q[(int) k]);

			sum1 = sum1 + q[(int) k];
			System.out.println("------------------------" + sum1);
		}

	}

}
