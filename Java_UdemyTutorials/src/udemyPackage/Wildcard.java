package udemyPackage;

import java.util.ArrayList;

class Machina{

	@Override
	public String toString() {
		return "X Makinaa!!!";
	}
	
	public void start() {
		System.out.println("Machine Started!");
	}
	
}

class Camera extends Machina{
	@Override
	public String toString() {
		return "La Cameraaa!!!";
	}
	
	public void snap() {
		System.out.println("Khichikk!");
	}
}


public class Wildcard {
	public static void main(String[] args) {
		System.out.println("-----Machina list-----");
		ArrayList<Machina> list = new ArrayList<>();
		list.add(new Machina());
		//list.add(new Machina());
		showlist(list);
		showlist1(list);
		//showlist2(list);
		
		System.out.println("-----Camera list-----");
		ArrayList<Camera> list2 = new ArrayList<>();
		list2.add(new Camera());
		//list2.add(new Camera());
		showlist(list2);
		showlist1(list2);
		showlist2(list2);
	}
	
	public static void showlist(ArrayList<?> list) {
		for(Object value:list) {
			System.out.println(value);
		}
	}
	
	public static void showlist1(ArrayList<? extends Machina> list) {
		for(Machina value:list) {
			value.start();
		}
	}
	
	public static void showlist2(ArrayList<? extends Camera> list) {
		for(Camera value:list) {
			value.snap();
		}
	}
	
	public static void showlist3(ArrayList<? super Camera> list) {
		for(Object value:list) {
			System.out.println(value);
		}
	}
	
	
	
}
