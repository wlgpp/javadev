package ba.coder.wlgpp.day7;

public class ArrTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		System.out.println("for��");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println("arr["+i+"]= "+arr[i]);
		}
		
		System.out.println();
		
		System.out.println("���� for��");
		for(int num : arr) {
			System.out.println("num : "+num);
		}
		
		System.out.println();
		
		System.out.println("while��");
		int i = 0;
		while(i != arr.length) {
			System.out.println("arr["+i+"]= "+arr[i++]);
		}
		
	}

}
