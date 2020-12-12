package udemyPackage;
import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String value;
		do {
			System.out.println("Enter your name");
		    value = input.nextLine();
			System.out.println("Hi there, "+ value);
		}while(!"Parisha".equals(value));
		System.out.println("Got Parisha!");
	}
}
