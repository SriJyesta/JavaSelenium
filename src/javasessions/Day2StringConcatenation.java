package javasessions;

public class Day2StringConcatenation {

	public static void main(String[] args) {
		
		String a="jyesta";
		String b="rc";
		
		int c=10,d=20;
		
		System.out.println(a+b+c+d);
		
		System.out.println((a+b)+(c+d));
		
		System.out.println(c+d+a+b);
		
		double q=12.25,w=12.20;
		System.out.println(q+w);
		
		float e=12.98f,r=25.92f;
		System.out.println((e+r)+(q+w));
		System.out.println(e+r+(q+w));
		System.out.println("Value is :" + q+w+e+r);
		
		
//		ASCII values can used in char data type
//		a-z=97 to 122
//		A-Z=65 to 90
//		0-9=48 to 57
		char m='v', v='n';
		System.out.println(m+v);
		System.out.println('j'+'g');
		System.out.println((int)'a');
		
		System.out.println("The value is :" + (int)'a');

	}

}
