package exam_interface;

public class TelevisionTest {

	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl();
	
//		구현 클래스 인스턴스
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.printChanner();
		tv.turnOff();
		System.out.println();
		
		
		Radio radio = new Radio("표준FM (MHz)", 95.9);
		radio.turnOn();
		radio.setVolume(1);
		radio.printRF();
		System.out.println(radio.toString());
		radio.turnOff();
		System.out.println();
	}
	


}
