package udemyPackage;

class Yo{
	private String name;
	public void getName() {
		System.out.println(name);
	}

	public void setName(String name) {
		this.name = name;
	}	
}
public class Encap {
	public static void main(String[] args) {
		Yo per1 = new Yo();
		per1.setName("Pari");
		per1.getName();
	}
}
