package javasessions;

public class Day2MathematicalOperations {

	public static void main(String[] args) {
		System.out.println(4*2);
		System.out.println(4/2);
		System.out.println(4+2);
		System.out.println(4-2);
		
		
		System.out.println((float)5/9);
		System.out.println((double)0.0/0.0);
		System.out.println((float)0/9);
		System.out.println(0/9);
		System.out.println((float)9/0);
		
		System.out.println("Nan. Infinity, Value case");
		
		System.out.println(0.0/0.0);//Nan
		System.out.println(0.0/0);//Nan
		System.out.println(9.0/0.0);//Infinity
		System.out.println(0.0/5.0);//0.0
		System.out.println(10/5.0);//2.0
		System.out.println(10.0/5.0);//2.0
		System.out.println(10.0/5);//2.0
		System.out.println(10/2.0*2);//10.0
		System.out.println(10/(2.0*2));//2.5
		
		float a=12.00f,b=2.00f,c=4.0f,d=2.00f;
		
		System.out.println("floating values :" + ((a/b)+(c/d))); //6.02.0
		
//		System.out.println(0/2);//0
		
		System.out.println("Exceptional case");
		
		System.out.println(2/0);
//		System.out.println(0/0);//Exceptionl err

	}

}
