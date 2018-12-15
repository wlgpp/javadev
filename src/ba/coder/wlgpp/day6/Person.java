package ba.coder.wlgpp.day6;

public class Person {

	private final String gender;
	//상수인경우에는 무조건 값을 초기화해줘야한다
	//근데 위와 같이 초기화하지않았을경우에는 생성자를 이용해서 초기화를 꼭 해줘야한다
	public Person(String input) {
		gender = input;
	} //이렇게 초기화를 해주던지
	
	// public Person(){} 
	// 위와같이 만들면 붉은 밑줄이 생김   너 펄슨이 파이널인건 아니? 하고 에러생김
	
	
	// 생성자는 객체를 생성하는것
	
}
