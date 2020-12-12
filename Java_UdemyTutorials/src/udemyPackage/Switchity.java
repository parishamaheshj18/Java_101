package udemyPackage;
import java.util.Scanner;
//hello
public class Switchity {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter command here :");
		
		String command = input.nextLine();
		
		switch(command) {
		case "start":
			System.out.println("Machine has Started!");
			break;
			
		case "stop":
			System.out.println("Machine has stopped!!");
			break;
			
		default:
			System.out.println("Command not found !!!");
			break;
			
		}
		command = null;
	}
}
