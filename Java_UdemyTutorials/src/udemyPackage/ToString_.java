package udemyPackage;

class Company {
	String name;
	int serialNo;
	public Company(int serialNo, String name) {
		this.serialNo = serialNo;
		this.name = name;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder("");
		str.append(serialNo).append(" : ").append(name);
		return str.toString();
	}
};

public class ToString_ {
	public static void main(String[] args) {
		Company car = new Company(1,"Honda");
		Company car1 = new Company(2,"Suzuki");
		
		System.out.println(car);
		System.out.println(car1);
	}
}
