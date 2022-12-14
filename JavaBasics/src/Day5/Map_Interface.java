package Day5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map_Interface {
	/*
	 * key and value pair
	 * key will not hav duplicates
	 * map will not hav insertion order
	 * key can hav only one null value
	 * 
	 * 
	 */
	
public static void main(String[] args) {
	HashMap<String,String> hm = new HashMap<String,String>();
	hm.put("A","Apple");
	
	hm.put("E","Elephant");
	hm.put("B", "Ball");
	hm.put("Z","Zebra");
	hm.put("D","Dog");
	System.out.println(hm);
	
	LinkedHashMap lhm = new LinkedHashMap();
	lhm.put("A","Apple");
	
	lhm.put("E","Elephant");
	lhm.put("B", "Ball");
	lhm.put("Z","Zebra");
	lhm.put("D","Dog");
	System.out.println(lhm);
	
	TreeMap tm = new TreeMap();
	tm.put("A","Apple");
	
	tm.put("E","Elephant");
	tm.put("B", "Ball");
	tm.put("Z","Zebra");
	tm.put("D","Dog");
	System.out.println(tm);
	
	System.out.println(hm.get("D"));
	hm.putIfAbsent("d", "Darling");
	System.out.println(hm);
	
	for(Map.Entry<String, String> entry : hm.entrySet()) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	
	for(String k : hm.keySet()) {
		System.out.println(k);
		System.out.println(hm.get(k));
	}
	
	Iterator<Map.Entry<String,String>> itr = hm.entrySet().iterator();
	while(itr.hasNext()) {
		Map.Entry<String, String> entry = itr.next();
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
	}
	
	hm.forEach((k,v) -> System.out.println(k+"  "+v));
	
}
}
