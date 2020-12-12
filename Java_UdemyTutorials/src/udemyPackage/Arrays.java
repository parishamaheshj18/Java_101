package udemyPackage;

public class Arrays {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[4];
		arr[0]=23;
		arr[1]=3;
		arr[2]=5;
		arr[3]=10;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		
		int[] arr2 = {3,4,5,6,7};
		
		for (int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
 	}
}
