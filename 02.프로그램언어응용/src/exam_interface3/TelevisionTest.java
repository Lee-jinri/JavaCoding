package exam_interface3;

public class TelevisionTest {

	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl();
	
//		���� Ŭ���� �ν��Ͻ�
		Television tv = new Television();
		RemoteControl.changeBattery();  // �������̽���.static�޼���(), ���� �޼ҵ� ȣ��!
		tv.turnOn();
		tv.setVolume(20);
		System.out.println(tv.toString());
		tv.setMute(true); // ����Ʈ �޼��� ȣ��
		tv.printChanner();
		tv.turnOff();
		System.out.println();
		
		
		SmartTelevision smart = new SmartTelevision();
		smart.turnOn();
		smart.search("www.naver.com");
		smart.turnOff();
		
		// �������� ����
		// �������̽� �������� = new ����Ŭ����������();
		// RemoteControl rc1 = new RemoteControl();
		RemoteControl rc = new Television();
		rc.turnOn();
		// rc.printChannel();
	}
	


}
