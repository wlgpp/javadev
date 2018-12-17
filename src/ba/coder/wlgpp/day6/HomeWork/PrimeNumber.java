package ba.coder.wlgpp.day6.HomeWork;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class PrimeNumber {

	public static void main(String[] args) {

		int inputNum = 0;
		int j = 2;

		inputNum = InputVal.getInt();

		for( ; ; ) {
			if(inputNum % j == 0) {
				if(inputNum == j) {
					System.out.println("입력한 숫자 "+inputNum+"은(는) 소수입니다.");
					break;
				} else {
					System.out.println("입력한 숫자 "+inputNum+"은(는) 소수가 아닙니다.");
					break;
				}

			} else {
				j++;
			}
		}

	}

}
