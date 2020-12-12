package udemyPackage;
import java.util.Scanner;

class Person{
	String name;
	int age;
	void speak() {
		if(age < 20) {
			System.out.println(name + " is a kid!");
		}
		else {
			System.out.println(name + " is a grownup!");
		}
	}
}

public class Classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person woman = new Person();
		System.out.println("Enter Your name:");
		Scanner ipName = new Scanner(System.in);
		woman.name = ipName.nextLine();
		System.out.println("Enter Your age:");
		Scanner ipAge = new Scanner(System.in);
		woman.age = ipAge.nextInt();
		System.out.println(woman.name + ", Aged " + woman.age + "!");
		woman.speak();
	}

}
