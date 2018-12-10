package ba.coder.wlgpp.day4.HomeWork;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class Game369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input;
		input = InputVal.getInt();

		for( int num=1 ; num<=input ; num++) {
			if( num % 3 == 0) {
				System.out.print("X ");
			} else {
			System.out.print(num+" ");
		}

		}
	}

}
