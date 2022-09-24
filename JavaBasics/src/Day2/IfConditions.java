package Day2;

public class IfConditions {

	public static void main(String[] args) {
		int num = -5;
		
		if (num > 0) {
			System.out.println("Positive number");
		}
		else if (num == 0) {
			System.out.println("Number is zero");
		}
		else {
			System.out.println("Negative number");
		}
		
		//eligible for voting - 18
		
		int age = 17;
		
		if (age >= 18) {
			System.out.println("Eligible for voting");
		
		}
		else {
			System.out.println("Not Eligible for voting");
		}
		
		//find greatest number from these numbers
		int a = 10;
		int b = 5;
		int c = 12;
		
		if (a > b && a > c) {
			System.out.println("A is greater");
		}
		else if (b > a && b > c) {
			System.out.println("B is greater");
		}
		else if(c>a && c>b) {
			System.out.println("C is greater");
		}
	}
}
