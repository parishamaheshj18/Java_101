package udemyPackage;

public class Mltdimarr {
	public static void main(String[] args) {
		int[][] arrayInt = {
								{1,2,3,4}, {1,2,3} , {100}
						    };
		
		for (int row=0;row<arrayInt.length;row++) {
			for (int col=0;col<arrayInt[row].length;col++) {
				System.out.print(arrayInt[row][col] + "\t");
				}
			System.out.println();
			}
		
		String[][] arrayStr = new String[2][3];
		arrayStr[0][1] = "Hello";
		
		for (int row=0;row<arrayStr.length;row++) {
			for (int col=0;col<arrayStr[row].length;col++) {
				System.out.print(arrayStr[row][col] + "\t");
				}
			System.out.println();
			}
		
		String[][] Parisha = new String[2][];
		System.out.println(Parisha.length);
				
	}
}
