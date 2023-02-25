package javasessions;

public class Day7TimeComplexity {

	public static void main(String[] args) {
		int a = 1;
		System.out.println(a); // Big O(1)

		for (int b = 1; b <= 10; b++) {// 1+n+n+n=3n+1--1 is constant

			// Linear equation - 3n> O(n) times

			++b;
			System.out.println(b);
//			++b;

		}

		int p = 1;
		while (p <= 1) {

			System.out.println(p);
			p++;
		}

		// 1+n+n+n=3n+1=3n=O(n)
		// if 6n+2=2(3n+1)=2(3n)=0(n)

		// nested loop
		
		

	}
}