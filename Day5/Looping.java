package Day5;

import java.util.ArrayList;
import java.util.ListIterator;

public class Looping {
public static void main(String[] args) {
	ArrayList al = new ArrayList();//10->11
	//newcap = currentcap * 1.5 + 1
	
	al.add(10);
	al.add(70);
	al.add("Hello");
	al.add(3.5);
	System.out.println(al);

	for(Object a : al) {
		System.out.println(a);
		
	}
	
	
	ListIterator ltr = al.listIterator();
	
	while(ltr.hasNext()) {
		
		//System.out.println(ltr.nextIndex()+"index");
		if(ltr.next() == "Hello") {
			ltr.remove();
		}
		System.out.println(ltr.next());
	}
//	System.out.println(al);
}
}
