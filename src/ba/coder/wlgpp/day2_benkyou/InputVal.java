package ba.coder.wlgpp.day2_benkyou;

import javax.swing.JOptionPane;

public class InputVal {

	public static int getInt() {
		String inputup = JOptionPane.showInputDialog("�Է�: ");
		int result = Integer.parseInt(inputup);
		return result;
	}



	/*	
	public static double getDpublic static double getDouble() {
		String inputup = JOptionPane.showInputDialog("���� �Է�:");
		double result = Double.parseDouble(inputup);
		return result;
		}ouble() {
		String inputup = JOptionPane.showInputDialog("���� �Է�:");
		double result = Double.parseDouble(inputup);
		return result;
		}
	 */

	public static double getDouble() {
		String inputup = JOptionPane.showInputDialog("Ű�� �Է� :");
		double result = Double.parseDouble(inputup);
		return result;
	}

	public static float getFlaot() {
		String inputup2 = JOptionPane.showInputDialog("�����Ը� �Է� :");
		float result = Float.parseFloat(inputup2);
		return result;
	}

}
