package ba.coder.wlgpp.day4.HomeWork;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class TwoNumverAverage {
	public static void main(String[] args) {
		
		int sum = 0;
		double avg = 0;
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("첫번째 수를 입력하세요");
		num1 = InputVal.getInt();
		
		System.out.println("두번째 수를 입력하세요");
		num2 = InputVal.getInt();
		
		sum = num1 + num2;
		avg = sum/2;
		
		System.out.println("평균은 "+avg+" 입니다");
		
	}
}
