package Day6;

import java.util.Arrays;

public class StringReverse {
	public static void main(String[] args) {
		
		String orig = "madam";
		String lowercase = orig.toLowerCase();
		String reverse = "";
//		
//		char[] arr = lowercase.toCharArray();
//		System.out.println(Arrays.toString(arr));
//		
//		
//		for(int i = arr.length-1; i>=0;i--) {
//			//System.out.println(arr[i]);
//			reverse = reverse + arr[i];
//		}
//		System.out.println(reverse);
		
		
		for(int i = lowercase.length()-1; i>=0 ; i--) {
		//	System.out.println(lowercase.charAt(i));
			reverse = reverse + lowercase.charAt(i);
		}
		
		
		if(reverse.equals(lowercase)) {
			System.out.println("Its palindarome");
		}else {
			System.out.println("Not Palindarome");
		}
	}
}
