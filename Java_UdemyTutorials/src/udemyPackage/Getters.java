package udemyPackage;
class Person1 {
	String name;
	int age;
	String getName() {return name;}
	int getAge() {return age;}
	}

public class Getters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 woman = new Person1();
		woman.name = "Hena";
		woman.age = 53;
		woman.getAge();
		woman.getName();
		System.out.println("Hi "+woman.getName()+ "! Your age is "+woman.getAge()+".");
		}

}
