package Abstract_class3;

public class SMSsender extends MessageSender {
	
	private String returnPhoneNo;
	private String message;
	
	// 생성자 ??? 더 공부하기
	// 제한자 클래스이름 (매개변수)
	public SMSsender(String title, String senderName, String returnPhoneNo, String message) {  // 필드 초기화
		super(title, senderName);  // 부모 클래스의 생성자 호출
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}
	
	@Override
	public void sendMessage(String recipient) {
		System.out.println("---------------------------");
		System.out.println("제목 : " + getTitle());
		System.out.println("보내는 사람 : " + getSenderName());
		System.out.println("전화번호 : " + recipient);
		System.out.println("회신 전화번호 : " + returnPhoneNo);
		System.out.println("메시지 내용 : " + message);
	}
	
	public String getReturnPhoneNo() {
		return returnPhoneNo;
	}
	
	public void setReturnPhoneNo(String returnPhoneNo) {
		this.returnPhoneNo = returnPhoneNo;
	}
	
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String Message) {
		this.message = Message;
	}


}
