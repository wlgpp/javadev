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
					System.out.println("�Է��� ���� "+inputNum+"��(��) �Ҽ��Դϴ�.");
					break;
				} else {
					System.out.println("�Է��� ���� "+inputNum+"��(��) �Ҽ��� �ƴմϴ�.");
					break;
				}

			} else {
				j++;
			}
		}

	}

}
