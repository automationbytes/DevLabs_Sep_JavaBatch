package Day5;

public class WrapperClass {
	public static void main(String[] args) {
		
		/*
		 * 
  * Wrapper - convert from primitive to object
  *int -Integer
  *float - Float
		 * 
		 * 
		 */
		int a = 10;
		Integer b = Integer.valueOf(a);//explictly - unboxing
		Integer i = a;//automatically  - autoboxing
		
		System.out.println(b);
		System.out.println(i);
	}
}
