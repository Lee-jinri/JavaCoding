package exam_interface_phone;

public class Messenger_Test {

	public static void main(String[] args) {
		
		// 실행클래스
		// 인스턴스 생성
//		Messenger msg = new Messenger(); // 인터페이스는 인스턴스를 생성할 수 없다.
	
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxyMessenger galaxy = new GalaxyMessenger();
		
		System.out.println("메신저 최소 문자 크기 " + Messenger.MIN_SIZE);
		System.out.println("메신저 최대 문자 크기 " + Messenger.MAX_SIZE);
		
		iphone.setLogin(true);
		System.out.println(iphone.getMessage());
		iphone.setMessage("안녕~~");
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
