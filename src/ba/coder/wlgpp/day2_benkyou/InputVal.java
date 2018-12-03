package ba.coder.wlgpp.day2_benkyou;

import javax.swing.JOptionPane;

public class InputVal {

	public static int getInt() {
		String inputup = JOptionPane.showInputDialog("입력: ");
		int result = Integer.parseInt(inputup);
		return result;
	}



	/*	
	public static double getDpublic static double getDouble() {
		String inputup = JOptionPane.showInputDialog("숫자 입력:");
		double result = Double.parseDouble(inputup);
		return result;
		}ouble() {
		String inputup = JOptionPane.showInputDialog("숫자 입력:");
		double result = Double.parseDouble(inputup);
		return result;
		}
	 */

	public static double getDouble() {
		String inputup = JOptionPane.showInputDialog("키를 입력 :");
		double result = Double.parseDouble(inputup);
		return result;
	}

	public static float getFlaot() {
		String inputup2 = JOptionPane.showInputDialog("몸무게를 입려 :");
		float result = Float.parseFloat(inputup2);
		return result;
	}

}
