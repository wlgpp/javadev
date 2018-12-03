package ba.coder.wlgpp.day3;

import javax.swing.JOptionPane;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dat;
		String inputData= JOptionPane.showInputDialog("값 입력:");
		dat = Integer.parseInt(inputData);
		if(dat%10 == 0) {
			System.out.println(dat +"는 10의배수입니다.");
		}
		else {
			System.out.println(dat+"는 10의 배수가 아닙니다");

		}


	}




}
