package Day2;

import java.util.Arrays;

public class Array_Eg {
	public static void main(String[] args) {
		int a[] = new int[3];//declaration
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
	//	a[3] = 40;
		System.out.println(Arrays.toString(a));
		
		int arr[] = {10,20,30};
		System.out.println(Arrays.toString(arr));
		
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int i : a) {
			System.out.println(i);
		}
	}
}
