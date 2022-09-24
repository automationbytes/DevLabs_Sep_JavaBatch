package Day2;

import java.util.Scanner;

public class SwitchStmts {
	public static void main(String[] args) {

		//int weekday = 5;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number (0-7):");
		int weekday = sc.nextInt();
		
		switch (weekday) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		case 0:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Invalid Input. Please enter the number between 0-7");
			break;
		}
	}
}

//0-9 -> 1 - one 2- two

