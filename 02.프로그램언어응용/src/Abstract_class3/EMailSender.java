package Abstract_class3;

public class EMailSender extends MessageSender {  // 추상클래스 상속
	
	private String senderAddr;	// 발송자 이름
	private String emailBody;	// 이메일 내용
	
	
	public EMailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);  // 부모 클래스의 생성자 호출
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	
	@Override
	public void sendMessage(String recipient) { // 추상메서드 오버라이팅, 선언이 부모 클래스의 추상 메서드와 동일해야함
		System.out.println("--------------------------");
		System.out.println("제목 : " + getTitle());
		System.out.println("보내는 사람 : " + getSenderName() + " " + senderAddr);
		System.out.println("받는 사람 : " + recipient);
		System.out.println("내용 : " + emailBody);
	}
	
	public String getsenderAddr() {  // 접근자
		return senderAddr;
	}
	
	public void setsenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}
	
	public String getemailBody() {
		return emailBody;
	}
	
	public void setMajor(String emailBody) {  // 설정자
		this.emailBody = emailBody;
	}

	
}
