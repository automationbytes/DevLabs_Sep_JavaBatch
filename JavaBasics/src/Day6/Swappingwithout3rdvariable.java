package Day6;

public class Swappingwithout3rdvariable {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		System.out.println("Before value");
		System.out.println(a);
		System.out.println(b);
		a = a+b;//  10+5
		b = a-b;//15-5//10 -> swapped now
		a = a-b;//15-10//5
		System.out.println("After value");
		System.out.println(a);
		System.out.println(b);
				
		
		String str1 = "abcde";//5
		String str2 = "xyz";//3
		
		str1 = str1+str2;//abcdexyz - 8 - 3
		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println(str1);
		System.out.println(str2);
	}
}
