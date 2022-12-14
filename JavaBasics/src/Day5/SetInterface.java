package Day5;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {
/*
 * No duplicates are allowed
 * insertion order will nt b preserved
 * random access not possible
 * only one null is allowed
 * 
 * 
 */
	
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(5);
		hs.add(15);
		hs.add(55);
		hs.add(25);
		hs.add(25);
		hs.add(25);
		
		System.out.println(hs);
		System.out.println(hs.size());
	
		//preserve insertion order - linkedhashset
		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("hi");
		lhs.add("apple");
		lhs.add("mango");
		lhs.add("banana");
		System.out.println(lhs);
		
		//sorted order - ascending order
		TreeSet ts = (TreeSet) new TreeSet().descendingSet();
		ts.add("hi");
		ts.add("apple");
		ts.add("mango");
		ts.add("banana");
		System.out.println(ts);
		
	}
}
