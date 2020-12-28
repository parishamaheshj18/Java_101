package udemyPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "text.docx";
		File textfile = new File(fileName);
		Scanner in = new Scanner(textfile);
		int value = in.nextInt();
		System.out.println(value);
		
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(line);
		}
		in.close();
		
	}
}
