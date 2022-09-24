package Day6;

import java.util.LinkedHashMap;

public class StringDuplicate {
public static void main(String[] args) {
	String str = "can you can a can as a canner can can a can?";
	
	String[] arr = str.toLowerCase().split(" ");
	LinkedHashMap<String,Integer> mymap = new LinkedHashMap<String,Integer>();
	for(String c : arr) {
		if(mymap.containsKey(c)) {
			mymap.put(c,mymap.get(c)+1);
		}else {
			mymap.put(c, 1);
		}
	}
	System.out.println(mymap);
	
}
}
