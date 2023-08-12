package exam_interface_phone;

// 부모 클래스에게 상속받고 인터페이스를 구현할 수 있는 클래스
public class IPhoneMessenger extends GraphicIOS implements Messenger {
	
	// 구현클래스
	
	// 재정의
	@Override
	public String getMessage() {
		return "iPhone";
	}
	
	// 재정의
	@Override
	public void setMessage (String msg) {
		System.out.println("iPhone에서 메시지를 설정합니다 : " + msg);
	}
	
	// 새로운 메소드
	public void clearMessage(){
		System.out.println("좌우로 흔들어 문장열을 지웁니다.");
	}
}
