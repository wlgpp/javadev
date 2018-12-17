package ba.coder.wlgpp.day7;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {70,80,60,90,70};
		int Max = 0;
		int Min = 0;

		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]>Max) {
				Max = arr[i];	
			}
		}
		System.out.println("최대값 = "+Max);

		Min = Max;

		for(int i = 0 ; i<arr.length ; i++) {
			if(arr[i]<Min) {
				Min = arr[i];	
			}
		}
		System.out.println("최소값 = "+Min);


	}

}
