package udemyPackage;

class Fish {
	public void start() {
		System.out.println("Fish is swimming");
	}
}

interface User{
	public void talk();
}

public class AnonymsClass {
	public static void main(String[] args) {
		Fish orca = new Fish() {
			@Override public void start() {
				System.out.println("Orca is swimming");
			}
		};
		
		orca.start();
		
		User user1 = new User() {
			public void talk() {
				System.out.println("Hello i'm talking");
			}
		};
		
		user1.talk();
		
	}
}
