package ba.coder.wlgpp.day7;

public class SumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {20,50,77,98,46,13,24,65,64,51};
		int sum = 0;

		for(int i=0 ; i<arr.length ; i++) {
			sum = sum + arr[i];
		}


		System.out.println("배열값 총합계 : "+sum);
		System.out.println("배열값의 평균 : "+(double)sum/(arr.length));
	}

}
