package Day6;

import java.util.LinkedHashMap;

public class StringOccurence {
	public static void main(String[] args) {

//		String str = "madam";
//		char[] arr = str.toLowerCase().toCharArray();
//		LinkedHashMap<Character,Integer> mymap = new LinkedHashMap<Character,Integer>();
//		for(char c : arr) {
//			if(mymap.containsKey(c)) {
//				mymap.put(c,mymap.get(c)+1);
//			}else {
//				mymap.put(c, 1);
//			}
//		}
//		System.out.println(mymap);
//		

		String str = "madam";
		int occurence[] = new int[str.length()];
		
		char arr[] = str.toCharArray();
		for(int i =0; i<str.length();i++) {
			occurence[i] = 1;
			for(int j = i+1 ; j<str.length();j++) {
				if(arr[i] == arr[j]) {
					occurence[i]++;
					
					arr[j] = '0';
				}
			}
			
		}
		
		for(int i = 0; i<occurence.length;i++) {
			if(arr[i] != '0') {
				System.out.println(arr[i]+"--"+occurence[i]);
			}
			
		}
	}
}
