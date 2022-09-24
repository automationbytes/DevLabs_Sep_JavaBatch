package Day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) {
		
		File file = new File("c:\\java\\sample.txt");
		Scanner myreadfile;
		try {
			myreadfile = new Scanner(file);
			while(myreadfile.hasNextLine()) {
				System.out.println(myreadfile.nextLine());
			}
			myreadfile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
