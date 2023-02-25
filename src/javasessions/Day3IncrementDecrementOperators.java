package javasessions;

public class Day3IncrementDecrementOperators {

	public static void main(String[] args) {

//		int a = 2;
//		int b = a++;
//		System.out.println(a);
//		System.out.println(b);
//
//		int a1 = -2;
//		int b1 = a1++;
//		System.out.println(a1);// -2+1
//		System.out.println(b1);// -2
//
//		int a2 = -20;
//		int b2 = ++a2;
//
//		System.out.println(a2);// 1-20
//		System.out.println(b2);// 1-20
//
//		int a3 = -20;
//		int b3 = --a3;
//
//		System.out.println(a3);// -1-20
//		System.out.println(b3);// -1-20
//
//		int a4 = -20;
//		int b4 = a4--;
//
//		System.out.println(a4);// -20-1
//		System.out.println(b4);// -20
//
//		int a5 = -20;
//
//		System.out.println(a5++);// -20
//		System.out.println(a5--);// -19-1 -19
//		System.out.println(--a5);// -1-20 -21
//		System.out.println(++a5);// 1-21 -20
//
//		int z = 10, x = 20, v = -30, n = -10, m = 10;
//		System.out.println(z++ + x++);// 30
//		// 11 21
//		System.out.println(z++ + v++);// 11-30=-19
//		// 12 -29
//		System.out.println(n++ + m++);// -10+10=0
//		// -9 11
//
//		System.out.println(z++ + m++ - --x);
//		// 12+11-20=3
//		// 13 12 -20
		
		System.out.println("-----------------");
		
		
		int na = 1;
		int x = na++ + na++ + na++ + na++;
		// 1+2+3+4
//		na=5
		int y = na-- + na-- + na-- + na--;
		// 5+4+3+2
//		na=1
		int z = ++na + ++na + ++na + ++na;
        //2+3+4+5
//		na=5
		int m = na-- - na-- - na-- - na--;
//        5-4-3-2
//		na=1
		
		System.out.println(x);// 10
		System.out.println(na);//
		System.out.println(y);// 14
		System.out.println(na);//
		System.out.println(z);// 14
		System.out.println(na);//
		System.out.println(m);// -4
		System.out.println(na);//1


	}

}
