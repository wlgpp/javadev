package ba.coder.wlgpp.day5;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SungJuk rec = new SungJuk();
		SungJuk rec2 = new SungJuk();
		
		rec.Std_num = JOptionPane.showInputDialog("학번");
		rec.Std_name = JOptionPane.showInputDialog("이름");
		rec.kor = Integer.parseInt(JOptionPane.showInputDialog("국어"));
		rec.eng = Integer.parseInt(JOptionPane.showInputDialog("영어"));
		rec.mat = Integer.parseInt(JOptionPane.showInputDialog("수학"));
		
		System.out.println(rec.Std_num + rec.Std_name + "의 성적입니다");
		rec.Sum();
		rec.Ave();
		
		
		rec2.Std_num = JOptionPane.showInputDialog("학번");
		rec2.Std_name = JOptionPane.showInputDialog("이름");
		rec2.kor = Integer.parseInt(JOptionPane.showInputDialog("국어"));
		rec2.eng = Integer.parseInt(JOptionPane.showInputDialog("영어"));
		rec2.mat = Integer.parseInt(JOptionPane.showInputDialog("수학"));
		
		System.out.println(rec.Std_num + rec.Std_name + "의 성적입니다");
		rec2.Sum();
		rec2.Ave();
	}

}
