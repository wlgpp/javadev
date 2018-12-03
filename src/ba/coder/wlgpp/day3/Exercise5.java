package ba.coder.wlgpp.day3;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Exercise5 exr = new Exercise5();
//		exr.practice04();
		exr.practice03();
		
	}
	public void practice04() {
		System.out.println("0에서 10까지의 수를 입력하십시오.");
		int input = InputVal.getInt();
		if (input>0 && input<=10) {
			System.out.println("0에서 10사이의 값을 입력했습니다");
		}
		else {
			System.out.println("0에서 10사이의 값을 입력하지 않았습니다");
		}

	}

	public void practice03() {
		System.out.println("2개의 정수를 입력하시오");

		int input01 = InputVal.getInt();
		int input02 = InputVal.getInt();
		
		if(input01 == input02) {
			System.out.println("두 숫자는 같습니다.");
		}
		else if(input01 > input02) {
			System.out.println(input02 +"보다"+input01+"이 더 큽니다");		
		}
		else if(input01 < input02) {
			System.out.println(input01 +"보다"+input02+"이 더 큽니다");
		}

	}

}
