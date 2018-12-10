package ba.coder.wlgpp.day5;

import ba.coder.wlgpp.day2_benkyou.InputVal;

public class SumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jum = 1;
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		
		while ( jum != 0 ) {
			
			jum = InputVal.getInt();
			System.out.println(jum);
			sum = jum + sum;
			cnt++;
			
		}
		avg = (double)sum/(cnt-1);
		
		System.out.println("시험 점수의 합계는 "+sum+" 입니다");
		System.out.println("시험 점수의 평균은 "+avg+" 입니다");
		System.out.println("카운트 값 :"+cnt);
		
		
	}

}
