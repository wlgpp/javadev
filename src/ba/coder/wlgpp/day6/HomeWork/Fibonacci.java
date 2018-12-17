package ba.coder.wlgpp.day6.HomeWork;

public class Fibonacci {

	public static void main(String[] args) {

		int a = 1;
		int b = 1;
		int c = 0;
		int sum = 0;
		
		for(int cnt = 1 ; cnt<=20 ; cnt++) {
			c = a + b;
			sum = c + sum;
			b = a;
			c = b;
			
			System.out.println(sum);
		}
		

	}

}
