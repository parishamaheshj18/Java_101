package udemyPackage;
import java.util.Scanner;

public class Scan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (true) {

			System.out.println("Enter a value : ");
			int value = input.nextInt();
			if (value == 0) {
				System.out.println("Got 0!");
				break;
			}
			System.out.println("You entered : \n" + value);
			

		}
	}
}
