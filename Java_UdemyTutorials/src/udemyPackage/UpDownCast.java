package udemyPackage;
class Machine{
	public void Start() {
		System.out.println("Machine has Started.");
	}
}

class Car extends Machine{
	public void Start() {
		System.out.println("Car has Started.");
	}
	public void Run() {
		System.out.println("Car is Running.");
	}
}

public class UpDownCast {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Car car1 = new Car();
		machine1.Start();
		car1.Start();
		car1.Run();
		System.out.println("-----Upcast------");
		//Upcast
		Machine machine2 = car1;
		machine2.Start(); // works because functionality decided by defined object
		// machine2.Run(); //--won't work because methods decided by variables
		System.out.println("-----Downcast------");
		//Downcast
		Machine machine3 = car1;
		Car car2 = (Car)machine3;
		car2.Start();
		car2.Run();
		
		//We cannot downcast between unrelated objects
		//Machine machine4 = new Machine();
		//Car Honda = (Car) machine4; //--won't work
	}
}
