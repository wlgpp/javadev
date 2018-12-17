package ba.coder.wlgpp.day7;

public class Array {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int i;
		System.out.println("배열 원소의 값출력");

		for(i=0 ; i<arr.length ; i++) {
			System.out.println("arr["+i+"] ="+arr[i]);
		}
		System.out.println();
		int lenght = arr.length;
		System.out.println("배열의길이 "+lenght);
	}

}
