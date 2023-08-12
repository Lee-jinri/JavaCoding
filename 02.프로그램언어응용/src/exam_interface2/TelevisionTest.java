package exam_interface2;

public class TelevisionTest {

	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl();
	
//		구현 클래스 인스턴스

		SmartTelevision smart = new SmartTelevision();
		smart.turnOn();
		smart.search("http://www.naver.com");
		smart.turnOff();
		
		// 다형성에 의해
		// 인터페이스 참조변수 = new 구현클래스생성자();
		// RemoteControl rc = new RemoteControl();
		RemoteControl rc = new Television();
		rc.turnOn();
		
	}
	


}
