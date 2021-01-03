package udemyPackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "/Users/parisha/Desktop/text.txt";
		//String fileName = "text.txt";
		
		File textfile = new File(fileName);
		Scanner in = new Scanner(textfile);
		int value = in.nextInt();
		System.out.println("Read Value: "+value);
		in.nextLine();
		int count =2;
		while(in.hasNextLine()) {
			String line = in.nextLine();
			System.out.println(count+" : "+line);
			count++;
		}
		in.close();
		
	}
}
