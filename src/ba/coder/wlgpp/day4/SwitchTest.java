package ba.coder.wlgpp.day4;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int In_Num;
		In_Num = InputVal.getInt();
		

		switch(In_Num) {
		case 1 :
			System.out.println("������ȸ�� �����ϼ̽��ϴ�");
			break;

		case 2 :
			System.err.println("��������� �����ϼ̽��ϴ�");
			break;

		case 3 : 
			System.out.println("�����Ա��� �����ϼ̽��ϴ�");
			break;

		case 4 :
			System.out.println("������ü�� �����ϼ̽��ϴ�");
			break;

		default :
			System.out.println("��ȣ�� �߸� �����̽��ϴ�");
			
		}
	}

}
