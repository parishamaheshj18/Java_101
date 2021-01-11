package udemyPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
			File file = new File("file1");
			
			BufferedReader buffRead =null;
			
			try {
				FileReader flRead = new FileReader(file);
				buffRead = new BufferedReader(flRead);
				
				String line;
				while((line = buffRead.readLine()) != null) {
					System.out.println(line);
				};
				
				
			} catch (FileNotFoundException e) {
				System.out.println("Can't find the file :" + file.toString());
			}catch (IOException e) {
				System.out.println("Can't read file");
			}
			
			try {
				buffRead.close();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NullPointerException ex) {
				//File was probably never opened
			}
			
	}

}
