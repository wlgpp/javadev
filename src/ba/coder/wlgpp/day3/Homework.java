package ba.coder.wlgpp.day3;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1;
		num1= InputVal.getInt();

		if (num1 >0) {
			if(num1 % 2 == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� ����̸鼭, ¦���Դϴ�");
			} else {
				System.out.println("�Է��Ͻ� ���ڴ� ����̸鼭, Ȧ���Դϴ�");
			}
		}
		else {
			if(num1 % 2 == 0) {
				System.out.println("�Է��Ͻ� ���ڴ� �����̸鼭, ¦���Դϴ�");
			} else {
				System.out.println("�Է��Ͻ� ���ڴ� �����̸鼭, Ȧ���Դϴ�");
			}

		}

	}

}
