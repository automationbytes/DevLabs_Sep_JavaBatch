package Day2;

public class WhileLoop {
	public static void main(String[] args) {

		int i = 1;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int num = 1234; //4321
		int reverse = 0;
//		while (num != 0) {
//			int remainder = num % 10;//4->40 + 3->430+2
//			reverse = reverse * 10 + remainder;
//			num = num / 10;
//		}
//		System.out.println(reverse);
//		
		
		for(; num !=0; num = num / 10) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			
		}
		System.out.println(reverse);
	}
}
