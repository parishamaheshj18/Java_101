package udemyPackage;

public class ArrayString {
	public static void main(String[] args) {
		String[] str = {"Hello", "World", "Parisha"};
		System.out.println(str[1]); 
		
		for(String str1 : str) {
			System.out.println(str1);
			System.out.println(str1);
		}
		
		String text = null;
		System.out.println(text);
		//comment added
		String[] texts  = new String[3];
		for(String txt : texts) {
			System.out.println(txt);
		}
		
		
		
		/*int[] arr = {1,2,3,4};
		for (int members : arr) {
			System.out.println(members);
		}*/
	}
}
