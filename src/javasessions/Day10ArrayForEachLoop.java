package javasessions;

public class Day10ArrayForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array Limitations:
		// Size is fixed: static array- We need to use dynamic aarray-arraylist
		// Storing different data types cannot handle- We can use Object Aray

		// Object emp[]= new Object[5]; can print dif data type values

		//

		int a[] = { 20, 30, 4, 50 };

		// For each loop
		for (int e : a) {
			System.out.println(e);
		}

		System.out.println("----------");
		int p[] = { 20, 30, 4, 50 };
		for (int j = p.length - 1; j >= 0; j--) {
			System.out.println(p[j]);
		}

		System.out.println("----------");
		Object emp[] = new Object[4];
		emp[0] = "Sri";
		emp[1] = 1;
		emp[2] = 12.23;
		emp[3] = "RC";
		for (Object e : emp) {
			System.out.println(e);
			emp[1] = 10;
			emp[2] = 0.23;

		}

	}

}
