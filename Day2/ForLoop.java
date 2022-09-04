package Day2;

public class ForLoop {
	public static void main(String[] args) {
		
		for(int i =1; i<=10; i++) {
			System.out.println("Hello   "+ i);
				
		}
		
		for(int i = 0; i<=100; i+=5) {
			System.out.println(i);
			if(i == 50) {
				break;
			}
		}
		
		System.out.println("*******************");
		
		for(int j = 5; j>0;j--) {
			System.out.println(j);
		}
	}
}
