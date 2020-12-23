package udemyPackage;

public class IfElse {

	public static void main(String[] args) {
		int loop =0;
		while(true) {
			System.out.println("Loop = " + loop);
			if(loop == 10) {
				break;
			}
			loop++;
		}
	}
}
