package ba.coder.wlgpp.day6;

public class ThisTest {
	// ���������϶� �Ķ��۾��� ǥ��
	private int Speed;
	private int Age;
	private String RobotName;
	private String RobotNum;
	
	ThisTest robot;
	// �̷��� �����صа�� �޼ҵ�(ThisTest robot, int age) ó�� �ȿ� �Ű������� �־ ����̰����ϰ�
	// �����Ծ��� �κ� �Ű������ǰ�� �ȿ� �����ϰ��ִ� ���ǵ� ������ ���� �ѹ� ���� ���� ���ȭ���־ ���� ����̰����ϴ�
	// robot.age  �̷������� ����̰�������!!!!

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
	
	// ����������� Ư���Ѱ����� �ʱ�ȭ���ֱ����� �����ڰ� �ʿ��Ѱ��̴�
	// �츮�� �����ڸ� Ư���� ������ �ʱ�ȭ�ϱ����� ����Ѵ�

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
