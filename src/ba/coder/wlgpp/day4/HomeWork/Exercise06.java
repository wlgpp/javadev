package ba.coder.wlgpp.day4.HomeWork;

public class Exercise06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise06 exr = new Exercise06();
		exr.practice01();

	}

	public void practice01() {
		System.out.println("1~10까지의 짝수를 출력합니다.");
		for(int i=1 ; i<=10 ; i++) {
			if(i % 2==0){
				System.out.println(i);
			}

		}
	}

}
