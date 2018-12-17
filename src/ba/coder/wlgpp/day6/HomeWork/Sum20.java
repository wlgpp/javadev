package ba.coder.wlgpp.day6.HomeWork;

public class Sum20 {

	public static void main(String[] args) {

		int i = 0;
		int j = 1;
		int k = 0;

		for(i=0 ; i<20 ; i++) {
			System.out.println("i = "+i);

			j = j + i;
			System.out.println("j = "+j);

			k = j + k ;
			System.out.println("k = "+k);
			System.out.println();

		}
	}
}

