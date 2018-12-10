package ba.coder.wlgpp.day4.HomeWork;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class CountDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		input = InputVal.getInt();
		
		for( int num=input-1 ; num>=0 ; num--) {
			System.out.println(num);
		}
	}

}
