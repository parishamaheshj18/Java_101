package udemyPackage;

import java.io.IOException;
import java.text.ParseException;

public class MultipleException  {
	public static void main(String[] args)  {
		MultipleException test= new MultipleException();
		/*
		try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Couldn't parse");
		}
		*/
		
		/*
		try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		//
		
	}
	public void run() throws IOException, ParseException {
		throw new ParseException("Error in command list.",2);
		
	}
}
