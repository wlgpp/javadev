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
		System.out.println("0���� 10������ ���� �Է��Ͻʽÿ�.");
		int input = InputVal.getInt();
		if (input>0 && input<=10) {
			System.out.println("0���� 10������ ���� �Է��߽��ϴ�");
		}
		else {
			System.out.println("0���� 10������ ���� �Է����� �ʾҽ��ϴ�");
		}

	}

	public void practice03() {
		System.out.println("2���� ������ �Է��Ͻÿ�");

		int input01 = InputVal.getInt();
		int input02 = InputVal.getInt();
		
		if(input01 == input02) {
			System.out.println("�� ���ڴ� �����ϴ�.");
		}
		else if(input01 > input02) {
			System.out.println(input02 +"����"+input01+"�� �� Ů�ϴ�");		
		}
		else if(input01 < input02) {
			System.out.println(input01 +"����"+input02+"�� �� Ů�ϴ�");
		}

	}

}
