package javasessions;

import java.util.Arrays;

public class Day9ArraysLiterals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String b[] = { "Sri", "Jyesta", "Rc" };

		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);

		}

		int a[] = new int[3];
		a[0] = 2;
		a[1] = 3;
		a[2] = 4;
		System.out.println(Arrays.toString(a));
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}

		String p[] = { "MF", "GC", "IE" };

		for (int k = 0; k < p.length; k++) {
			System.out.println(p[k]);

			switch (p[k]) {
			case "MF":
				System.out.println("MF Opened");
				break;

			case "GC":
				System.out.println("GC Opened");
				break;

			case "IE":
				System.out.println("IE Opened");
				break;

			default:
				System.out.println("No browser found");
				break;
			}

//			if (p[k].equals("GC")) {
//				System.out.println("GC Opened");
//			}
//
//			else if (p[k].equals("IE")) {
//				System.out.println("IE Opened");
//			}
//
//			else if (p[k].equals("MF")) {
//				System.out.println("MF Opened");
//			}

		}

	}
}
