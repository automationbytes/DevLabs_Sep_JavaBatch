package Day2;

import java.util.Arrays;

public class Strings_Eg {
	public static void main(String[] args) {

		//literal - String pool memory
		String s = "hello";
		String s1 = "hello";
		//new Keyword //heap memory
		String s2 = new String("hello");//
		String s3 = new String("HELLO");//
		
		
		//== -> value and memory
		System.out.println(s == s1); //true
		System.out.println(s ==s2); //false
		System.out.println(s3 ==s2); //false
		
		
		//equals
		System.out.println(s.equals(s2));
		
		
		//equalsignorecase
		System.out.println(s.equalsIgnoreCase(s3));
	
	
	String a = "ABC";//65 66 67
	String b = "aDE";//97 68 69
	
	System.out.println(a.compareTo(b));
	
	System.out.println(a.compareToIgnoreCase(b));
	
	//concat
	System.out.println(a.concat(b));
	System.out.println(a+b);
	
	//contains
	String c = "Hello World 2022";
	System.out.println(c.contains("World"));
	
	//startswith
	System.out.println(c.startsWith("Hel"));
	//endswith
	System.out.println(c.endsWith("2022"));
	
	//length
	System.out.println(c.length());
	
	String d = " ";
	//isempty
	System.out.println(d.isEmpty());
	
	//isblank
	System.out.println(d.isBlank());
	
	
	String e = "elephant";
	System.out.println(e.indexOf("e",1));
	
	System.out.println(e.charAt(5));
	
	System.out.println(e.replaceAll("e", "E"));
	
	
	String f = "    Java is one of the popular language   ";
	String[] arr = f.split(" ");
	System.out.println(arr[0]);
	System.out.println(Arrays.toString(arr));
	
	//trim
	
	System.out.println(f.trim());
	//strip
	System.out.println(f.strip());
	
	//leadingstrip
	System.out.println(f.stripLeading());//trim leftside
	
	System.out.println(f.stripTrailing());//trim rightside
	
	}

}
