package udemyPackage;

public class App {
	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree plant2 = new Tree();
		Plant plant3 = plant2;
		plant1.grow();
		plant2.grow();
		plant3.grow();
		
		plant2.shedLeaves();
		doGrow(plant2);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
}
