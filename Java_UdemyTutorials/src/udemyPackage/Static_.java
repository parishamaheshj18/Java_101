package udemyPackage;

public class Static_ {
	public int id ;
	public static int count = 0;
	
	public Static_() {
		id = count;
		count++;
	}
	
	public static String description;
	
	public static void showDescription() {
		System.out.println(description+count);
	}
	public void showID() {
		System.out.println(id+ description);
	}
	
	public static void main(String[] args) {
		Static_ exp = new Static_();
		Static_ exp1 = new Static_();
		Static_ exp2 = new Static_();
		System.out.println(exp.id);
		Static_.description = "Hello this is a static program.";
		Static_.showDescription();
		exp.showID();
		
		
	}

}
