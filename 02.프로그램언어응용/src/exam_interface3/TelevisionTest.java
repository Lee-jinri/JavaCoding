package exam_interface3;

public class TelevisionTest {

	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl();
	
//		구현 클래스 인스턴스
		Television tv = new Television();
		RemoteControl.changeBattery();  // 인터페이스명.static메서드(), 정적 메소드 호출!
		tv.turnOn();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.setMute(true); // 디폴트 메서드 호출
		tv.printChanner();
		tv.turnOff();
		System.out.println();
		
		
		SmartTelevision smart = new SmartTelevision();
		smart.turnOn();
		smart.search("www.naver.com");
		smart.turnOff();
		
		// 다형성에 의해
		// 인터페이스 참조변수 = new 구현클래스생성자();
		// RemoteControl rc1 = new RemoteControl();
		RemoteControl rc = new Television();
		rc.turnOn();
		// rc.printChannel();
	}
	


}
