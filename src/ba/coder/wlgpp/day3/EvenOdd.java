package ba.coder.wlgpp.day3;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int num3;

		num1= InputVal.getInt();
		num2= InputVal.getInt();
		num3= InputVal.getInt();

		if (num1 % 2 == 0) {
			System.out.println(num1);
		}
		if (num2 % 2 == 0) {
			System.out.println(num2);
		}
		if (num3 % 2 == 0) {
			System.out.println(num3);
		}
		
	}

}
