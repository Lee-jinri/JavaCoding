package exam_interface_phone;

public class Messenger_Test {

	public static void main(String[] args) {
		
		// ����Ŭ����
		// �ν��Ͻ� ����
//		Messenger msg = new Messenger(); // �������̽��� �ν��Ͻ��� ������ �� ����.
	
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("�޽��� �ּ� ���� ũ�� " + Messenger.MIN_SIZE);
		System.out.println("�޽��� �ִ� ���� ũ�� " + Messenger.MAX_SIZE);
		
		iphone.setLogin(true);
		System.out.println(iphone.getMessage());
		iphone.setMessage("�ȳ�~~");
		iphone.clearMessage();
		
		iphone.draw_textbook();
		iphone.draw_textbook();
		
		
		
		galaxy.setLogin(true);
		System.out.println(galaxy.getMessage());
		galaxy.setMessage(galaxy.getMessage());
		galaxy.changeKeyboard();
		
		galaxy.fileUpload();
		galaxy.fileDownload();
		
		

	}

}
