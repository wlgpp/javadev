package ba.coder.wlgpp.day6;

public class ThisTest {
	// 전역변수일때 파랑글씨로 표시
	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;
	
	ThisTest robot;
	// 이렇게 선언해둔경우 메소드(ThisTest robot, int age) 처럼 안에 매개변수로 넣어서 사용이가능하고
	// 저렇게쓰면 로봇 매개변수의경우 안에 포함하고있는 스피드 에이지 네임 넘버 값이 전부 모듈화돼있어서 전부 사용이가능하다
	// robot.age  이런식으로 사용이가능해짐!!!!

	public ThisTest() {
		this(0,0,"","");
	}
	
	public ThisTest(int Age, String RobotName, String RobotNum) {
		this.Age=Age;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}

	public ThisTest(int Speed,int Age, String RobotName, String RobotNum) {
		this.Speed=Speed;
		this.Age=Age;
		this.RobotName=RobotName;
		this.RobotNum=RobotNum;
	}
	
	// 멤버변수들을 특정한값으로 초기화해주기위해 생성자가 필요한것이다
	// 우리는 생성자를 특정한 값으로 초기화하기위해 사용한다

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getRobotName() {
		return RobotName;
	}

	public void setRobotName(String robotName) {
		RobotName = robotName;
	}

	public String getRobotNum() {
		return RobotNum;
	}

	public void setRobotNum(String robotNum) {
		RobotNum = robotNum;
	}
	

	
	
	
}
