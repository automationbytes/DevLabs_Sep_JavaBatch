package Day5;

import java.util.ArrayList;
import java.util.Collections;

public class Generics_Eg {
public static void main(String[] args) {
	ArrayList<String> a = new ArrayList<String>();
	a.add("hello");
	a.add("apple");
	a.add("zebra");
	//Collections.sort(a,Collections.reverseOrder());
	Collections.sort(a);
	Collections.reverse(a);
	System.out.println(a);
	}
}

