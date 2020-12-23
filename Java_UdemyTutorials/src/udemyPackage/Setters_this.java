package udemyPackage;
class animal{
	private String name;
	private String type;
	
	public void setName(String name) {
		this.name = name; //no need to use this everywhere. Only whin the argument name is the same as variable's name
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	void setInfo(String name, String type) {
		setName(name);
		setType(type);
	}
	
	void getInfo() {
		System.out.println("Pet's name is "+name+" and it's "+type);
	}
}
public class Setters_this {
	public static void main(String[] args) {
		animal pet1 = new animal();
		pet1.setName("Jumbo");
		pet1.setType("an Elephant");
	
		animal pet2 = new animal();
		pet2.setInfo("Cyborg","a Dog");
		
		pet1.getInfo();
		pet2.getInfo();
	}
}
