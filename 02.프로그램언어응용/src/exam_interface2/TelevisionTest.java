package exam_interface2;

public class TelevisionTest {

	public static void main(String[] args) {
//		RemoteControl rc = new RemoteControl();
	
//		���� Ŭ���� �ν��Ͻ�

		SmartTelevision smart = new SmartTelevision();
		smart.turnOn();
		smart.search("http://www.naver.com");
		smart.turnOff();
		
		// �������� ����
		// �������̽� �������� = new ����Ŭ����������();
		// RemoteControl rc = new RemoteControl();
		RemoteControl rc = new Television();
		rc.turnOn();
		
	}
	


}
