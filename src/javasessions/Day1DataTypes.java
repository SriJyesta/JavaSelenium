package javasessions;

public class Day1DataTypes {

	public static void main(String[] args) {
//		1 byte range-- -127  to 127
		
		byte a=-128;
		byte b=127;
		
		byte x=100;
		byte y=29;
		
		byte t =(byte) (x+y);
		System.out.println("------:" +(int)t); 
		
		
		
//		2 short range-- -32768  to 32767
		
		short a1=-128;
		short b2=127;
		
//		3 int range-- - -2^31 to 2^31-1
		
		int a2=-12890089;
		int b3=127456;
		
//		4 long range-- -2^63 to 2^63-1
		
		long num=-1282554;
		long num2=127879688332323l;

//		Floating point
//		5 float 
		float v= 13.252544f;
		float n= (float)12.25;
		float f=100;
		System.out.println(v);
		
//		6 double
		
		double d = 12.5666d;
		double d2 = 12.5666;
		
		
//		7 char A-Z, a-z, 0-9. !@#$%^&*()_+
		char q = '1';
		int q1 = 'a';
		
		System.out.println("ASCII value is :" + q1);
		char q2 = ' ';
		
		
	}

}
