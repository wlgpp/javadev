package ba.coder.wlgpp.day5;

public class SungJuk {

	public String Std_num;
	public String Std_name;
	public int kor, eng, mat;
	
	public int Sum() {
		System.out.println("�հ�� "+(kor+eng+mat)+"�Դϴ�");
		return kor+eng+mat;
		
	}
	public void Ave() {
		System.out.println("����� "+(Sum()/3)+"�Դϴ�");
		
	}
}
