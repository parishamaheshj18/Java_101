package udemyPackage;


class baby {
	public void cry(String volume) {
		if(volume=="loud") {
			System.out.println("UUAUUU UAAUUU!!!");
		}
		else {
			System.out.println("uau uau!");
		}
	}
	public void months(int month) {
		System.out.println("The baby is "+month+" months old:)");
	}
	
	public void salary(int amount, String currency) {
		System.out.println("The baby earns "+amount +" "+currency+ " per hour.");
	}
}
public class Methods {
	public static void main(String[] args) {
		baby sam = new baby();
		sam.cry("low");
		sam.months(12);
		sam.salary(45, "USD");
	}
}
