package udemyPackage;

public class String_ {
	public static void main(String[] args) {
		String sb = new String("Hello! ");
		sb += "My name is Pari";
		
		StringBuilder sb1 = new StringBuilder("HI! ");
		sb1.append("My Name is non-Pari. ").append("I'm 400 yo");
		System.out.println(sb);
		System.out.println(sb1);
		
		System.out.printf("%-2.1f\n",4.5559);
		System.out.printf("%-2.1f%%",4.5559);
		
	}
}
