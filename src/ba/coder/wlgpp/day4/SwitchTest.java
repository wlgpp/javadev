package ba.coder.wlgpp.day4;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int In_Num;
		In_Num = InputVal.getInt();
		

		switch(In_Num) {
		case 1 :
			System.out.println("예금조회를 선택하셨습니다");
			break;

		case 2 :
			System.err.println("예금출금을 선택하셨습니다");
			break;

		case 3 : 
			System.out.println("예금입금을 선택하셨습니다");
			break;

		case 4 :
			System.out.println("예금이체를 선택하셨습니다");
			break;

		default :
			System.out.println("번호를 잘못 누르셨습니다");
			
		}
	}

}
