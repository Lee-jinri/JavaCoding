package Abstract_class3;

public abstract class MessageSender {  // 추상클래스
	
	// 필드 생성
	private String title;  
	private String senderName;
	
	public MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}
	
	// 설정자 
	public String getTitle() {
		return title;
	}
	
	// 접근자
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSenderName() {
		return senderName;
	}
	
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	
	// 추상메서드, 받는 사람
	// 접근제한자 제어자 리턴타입 메서드명 (매개변수); (메서드 선언 O, 메서드 정의 X)
	public abstract void sendMessage(String recipient); 
	

}
