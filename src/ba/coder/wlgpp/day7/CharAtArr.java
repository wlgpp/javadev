package ba.coder.wlgpp.day7;

import javax.swing.JOptionPane;

public class CharAtArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = JOptionPane.showInputDialog("입력해주세요");

		char inputArr[] = new char[input.length()];

		for(int i=0 ; i<input.length() ; i++) {
			inputArr[i] = input.charAt(i);
		}

		boolean isPalindrom = true;
		for(int i = 0 ; i<inputArr.length/2; i++) {
			if(inputArr[i] != inputArr[inputArr.length-1-i]) {
				isPalindrom = false;
				break;
			}
		}

		if(isPalindrom) {
			System.out.println("회문입니다");
		} else {
			System.out.println("회문이 아닙니다");
		}
	}

}
