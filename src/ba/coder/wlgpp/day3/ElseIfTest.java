package ba.coder.wlgpp.day3;

import javax.swing.JOptionPane;

public class ElseIfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int JumSu;
		char HakJum;
		JumSu = Integer.parseInt(JOptionPane.showInputDialog("�����Է�: "));

		if (JumSu>= 90) {
			HakJum ='A';
		}
		else if(JumSu>=80) {
			HakJum ='B';
		}
		else if(JumSu>=70) {
			HakJum ='C';
		}
		else if(JumSu>=60) {
			HakJum ='D';
		}
		else {
			HakJum = 'F';
		}
		System.out.println("������ "+HakJum+" �Դϴ�.");
	}

}
