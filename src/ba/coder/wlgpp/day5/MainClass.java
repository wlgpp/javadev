package ba.coder.wlgpp.day5;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuk rec = new SungJuk();
		SungJuk rec2 = new SungJuk();
		
		rec.Std_num = JOptionPane.showInputDialog("�й�");
		rec.Std_name = JOptionPane.showInputDialog("�̸�");
		rec.kor = Integer.parseInt(JOptionPane.showInputDialog("����"));
		rec.eng = Integer.parseInt(JOptionPane.showInputDialog("����"));
		rec.mat = Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		System.out.println(rec.Std_num + rec.Std_name + "�� �����Դϴ�");
		rec.Sum();
		rec.Ave();
		
		
		rec2.Std_num = JOptionPane.showInputDialog("�й�");
		rec2.Std_name = JOptionPane.showInputDialog("�̸�");
		rec2.kor = Integer.parseInt(JOptionPane.showInputDialog("����"));
		rec2.eng = Integer.parseInt(JOptionPane.showInputDialog("����"));
		rec2.mat = Integer.parseInt(JOptionPane.showInputDialog("����"));
		
		System.out.println(rec.Std_num + rec.Std_name + "�� �����Դϴ�");
		rec2.Sum();
		rec2.Ave();
	}

}
