package ba.coder.wlgpp.day4.HomeWork;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class TwoNumverAverage {
	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("ù��° ���� �Է��ϼ���");
		num1 = InputVal.getInt();
		
		System.out.println("�ι�° ���� �Է��ϼ���");
		num2 = InputVal.getInt();
		
		sum = num1 + num2;
		avg = sum/2;
		
		System.out.println("����� "+avg+" �Դϴ�");
		
	}
}
