package exam_interface;

public class TelevisionTest {

	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl();
	
//		���� Ŭ���� �ν��Ͻ�
		Television tv = new Television();
		tv.turnOn();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.printChanner();
		tv.turnOff();
		System.out.println();
		
		
		Radio radio = new Radio("ǥ��FM (MHz)", 95.9);
		radio.turnOn();
		radio.setVolume(1);
		radio.printRF();
		System.out.println(radio.toString());
		radio.turnOff();
		System.out.println();
	}
	


}
