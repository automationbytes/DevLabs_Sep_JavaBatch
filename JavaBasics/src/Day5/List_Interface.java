package Day5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class List_Interface {
	public static void main(String[] args) {

		/*
		 * List can store elements sequential order
		 * Insertion order will be preserved
		 * Able to access with index
		 * Null insertion is also possible
		 *	 * 
		 */
		
		ArrayList al = new ArrayList();//10->11
		//newcap = currentcap * 1.5 + 1
		
		al.add(10);
		al.add(70);
		al.add("Hello");
		al.add(3.5);
		System.out.println(al);
		al.add(2, "Devops");
		System.out.println(al);
		
		LinkedList link = new LinkedList();
		link.add("hello");
		link.add("world");
		link.add(5);
		al.addAll(link);
		System.out.println(al);
		al.addAll(2, link);
		System.out.println(al);
		
		//get
		System.out.println(al.get(5));
		
		//set
		al.set(5, "Devlabs");
		System.out.println(al);
		
		//remove
		al.remove(2);
		System.out.println(al);
		al.remove("worl");
		System.out.println(al);
		
		al.removeIf(a -> (a == "world"));
		System.out.println(al);
		//empty
		//al.clear();
		System.out.println(al);
		
		ArrayList newlist = (ArrayList) al.clone();
		System.out.println(newlist);
		
		System.out.println(al.contains("Devlabs"));
		
//		al.ensureCapacity(50);
//		System.out.println(al);
		
		System.out.println(al.indexOf(5));
		System.out.println(al.lastIndexOf(5));
		
		//vector - new = old*2
		
		Vector v = new Vector(2);
		v.add(5);
		v.add(7);//2
		v.add(8);//--------4
		v.add(9);//4
		v.add(4);//8
		v.add(8);//
		v.add(9);//
		v.add(4);//
		v.add(88);//16
		
		
		System.out.println(v.capacity());
		v.addElement(5);
		System.out.println(v);
		v.elementAt(5);
		
	}
	
	
}
