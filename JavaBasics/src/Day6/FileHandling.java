package Day6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
public static void main(String[] args) {
	
	File file = new File("sample1.txt");
	try {
		if(file.createNewFile()) {
			System.out.println(file.getAbsolutePath());
			System.out.println(file.getCanonicalPath());
			
			System.out.println(file.getPath());
			
			
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		FileWriter filewriter = new FileWriter("c:/java/sample.txt");
		filewriter.write("Test file 123");
		filewriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
