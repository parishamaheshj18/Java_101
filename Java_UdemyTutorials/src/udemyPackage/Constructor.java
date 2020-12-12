package udemyPackage;
class fruit{
	private String name;
	private int quantity;
	
	public fruit() {
		this("Mango");
		System.out.println("Constructor is created!");
		
	}
	public fruit(String name) {
		this(name,0);
		System.out.println("Second Constructor is created!");
	}
	public fruit(int quantity) {
		this("Mango",quantity);
		System.out.println("Second Constructor is created!");
	}
	
	public fruit(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
		System.out.println("Third Constructor is created!");
	}
	
	public void getInfo(){
		System.out.println("There are "+quantity+ " "+name+"s. Yumm!");
	}
}
public class Constructor {
	public static void main(String[] args) {
		fruit fruit1 = new fruit("Banana",30);
		fruit fruit2 = new fruit("Peach");
		fruit fruit3 = new fruit(50);
		fruit fruit4 = new fruit();
		
		fruit1.getInfo();
		fruit2.getInfo();
		fruit3.getInfo();
		fruit4.getInfo();
	}
}
//
