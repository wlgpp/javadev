package ba.coder.wlgpp.day4.HomeWork;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class Largest_Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int min = 0;
		
		int num1;
		int num2;
		
		num1 = InputVal.getInt();
		num2 = InputVal.getInt();
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		} else {
			min = num1;
			max = num2;
		}
		
		System.out.println(min + "가 가장 작고 "+ max+" 이 가장 큽니다");
		
	}

}
