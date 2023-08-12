package Abstract_class3;

// 출력 클래스
public class MassageSenderTest {

	public static void main(String[] args) {
		
		// 인스턴스 생성
		EMailSender email = new EMailSender(
			"생일을 축하합니다.","고객센터","admin@dukeeshop.co.kr","10% 할인쿠폰이 발행되었습니다.");
		email.sendMessage("javaone@naver.com"); // 받는 사람, 추상메서드 출력
		
		SMSsender sms = new SMSsender(
			"생일을 축하합니다","고객센터","02-0000-0000","10% 할인쿠폰이 발행되었습니다.");
		sms.sendMessage("010-000-0000");	// 받는 사람
		
//		MessageSender ms = new MessageSender)();
//		추상 클래스는 인스턴스를 생성할 수 없다. 추상 메서드를 포함하기 때문
		

		}
}
