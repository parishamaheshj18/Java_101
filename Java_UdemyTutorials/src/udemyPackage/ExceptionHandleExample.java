package udemyPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionHandleExample {
	public static void main(String[] args) {
		try {
			openFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Filenot Found!");
		}
		
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("new.txt");
		FileReader fr = new FileReader(file);
		
	}
}
