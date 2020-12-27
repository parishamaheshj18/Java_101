package udemyPackage;
import java.util.ArrayList;
import java.util.HashMap;

public class Generics {
	public static void main(String[] args) {
		//////Befor Java 5/////
		ArrayList list = new ArrayList();
		list.add("Apple");
		list.add("Orange");
		list.add("Banana");
		
		String fruit = (String) list.get(2);
		System.out.println(fruit);
		System.out.println(list.get(1));
		
		///Modern Style
		System.out.println("----Modern Style-----");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("Cat");
		list2.add("Dog");
		String pet = list2.get(1);
		System.out.println(pet);
		
		//////More than one type of parameters///
		HashMap<Integer,String> map = new HashMap();
		map.put(1, "Honda");
		System.out.println(map.get(1));
	}
}
