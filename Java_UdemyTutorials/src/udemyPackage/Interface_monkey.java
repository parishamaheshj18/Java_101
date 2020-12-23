package udemyPackage;

public class Interface_monkey implements Int_Body {
	private String name;
	private int Age;
	private int id;
	private String voice;
	public void setName(String a) {
		// TODO Auto-generated method stub
		name = a;
	}
	
	public void setAge(int a) {
		// TODO Auto-generated method stub
		Age = a;
	}
	
	public void setID(int a) {
		// TODO Auto-generated method stub
		id = a;
	}
	public void voice(String a) {
		// TODO Auto-generated method stub
		this.voice=a;
	}
	
	public void jump() {
		System.out.println(name + " monkey is jumping");
	}
}
