package Day4;

public class ThrowEg {
	
	static void validatepostivenum(int num) {
		if (num < 0) {
			throw new ArithmeticException("Negative numbers are not allowed");
		}
		else {
			System.out.println("Positive numbr");
		}
	}
	
public static void main(String[] args) {
	validatepostivenum(-50);
	
}
}
