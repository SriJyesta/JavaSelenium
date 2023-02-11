package javasessions;

public class Day3FinalKeyword {

	static {
		System.out.println("Hi Final Block");
	}

	public static void main(String[] args) {

//		constant values
		final int x = 12;
		System.out.println(x);
//		x=13;this will not allow to replace the value 

	}

	static {
		
		// static blocks always executes first before main method
		System.out.println("How are you");
	}

}
