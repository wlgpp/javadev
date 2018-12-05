package ba.coder.wlgpp.day3;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		num1= InputVal.getInt();

		if (num1 >0) {
			if(num1 % 2 == 0) {
				System.out.println("입력하신 숫자는 양수이면서, 짝수입니다");
			} else {
				System.out.println("입력하신 숫자는 양수이면서, 홀수입니다");
			}
		}
		else {
			if(num1 % 2 == 0) {
				System.out.println("입력하신 숫자는 음수이면서, 짝수입니다");
			} else {
				System.out.println("입력하신 숫자는 음수이면서, 홀수입니다");
			}

		}

	}

}
