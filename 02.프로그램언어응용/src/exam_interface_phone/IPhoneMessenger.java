package exam_interface_phone;

// �θ� Ŭ�������� ��ӹް� �������̽��� ������ �� �ִ� Ŭ����
public class IPhoneMessenger extends GraphicIOS implements Messenger {
	
	// ����Ŭ����
	
	// ������
	@Override
	public String getMessage() {
		return "iPhone";
	}
	
	// ������
	@Override
	public void setMessage (String msg) {
		System.out.println("iPhone���� �޽����� �����մϴ� : " + msg);
	}
	
	// ���ο� �޼ҵ�
	public void clearMessage(){
		System.out.println("�¿�� ���� ���忭�� ����ϴ�.");
	}
}
