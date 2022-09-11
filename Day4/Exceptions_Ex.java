package Day4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions_Ex {
	//int a =12;
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream file = new FileInputStream("");
		file.read();
	//	throw new FileNotFoundException();
		
		Thread.sleep(5000);
		
		System.out.println(12/0);
		
		System.out.println("hello");
	}
	
}
