package ba.coder.wlgpp.day3;

import javax.swing.JOptionPane;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dat;
		String inputData= JOptionPane.showInputDialog("�� �Է�:");
		dat = Integer.parseInt(inputData);
		if(dat%10 == 0) {
			System.out.println(dat +"�� 10�ǹ���Դϴ�.");
		}
		else {
			System.out.println(dat+"�� 10�� ����� �ƴմϴ�");

		}


	}




}
