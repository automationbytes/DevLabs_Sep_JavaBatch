package Day2;

import java.util.Arrays;

public class Array_Exercises {
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,1,2,3};
		for(int i = 0; i<arr.length; i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
		
		int arr1[] = {7,5,1,4,3,6,4};
		int temp = 0;
		for(int i = 0; i<arr1.length; i++) {
			for(int j=i+1; j<arr1.length; j++) {
				if(arr1[i] < arr1[j]) {
					temp = arr1[i];//temp = 7
					arr1[i] = arr1[j]; //arr1[i] = 5
					arr1[j] = temp;//arr1[j] = 7
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(arr1[0]);//largest number
		
		
		//reversing an array
		int arr2[] = {7,5,1,4,3,6,4};
		System.out.println(Arrays.toString(arr2));
		for(int i=arr2.length-1;i>=0;i--) {
			System.out.println(arr2[i]);
		}
		
		
		
		int multi[][] = {{1,2,3},{4,5,6},{7,8,9}}; 
		for(int i = 0; i<multi.length;i++) {
			for(int j =0; j<multi.length;j++) {
				System.out.print(multi[i][j]+ " ");
			}
			System.out.println();
		}
		
	}
}





//reversing an array

