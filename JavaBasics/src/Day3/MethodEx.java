package Day3;

public class MethodEx {

	static int sum(int a, int b) {
		return a+b;
	}
	
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	static float sum(float a, float b) {
		return a+b;
	}
	
	static String sum(String a, String b) {
		return a+b;
	}
	
	
	static int sub(int a, int b) {
		return a-b;
	}
	
	static int mul(int a, int b) {
		return a*b;
	}
	
	static int div(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(sum(5,5));
			//sum();
	}

}
