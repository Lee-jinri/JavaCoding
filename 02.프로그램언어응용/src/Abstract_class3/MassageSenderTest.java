package Abstract_class3;

// ��� Ŭ����
public class MassageSenderTest {

	public static void main(String[] args) {
		
		// �ν��Ͻ� ����
		EMailSender email = new EMailSender(
			"������ �����մϴ�.","������","admin@dukeeshop.co.kr","10% ���������� ����Ǿ����ϴ�.");
		email.sendMessage("javaone@naver.com"); // �޴� ���, �߻�޼��� ���
		
		SMSsender sms = new SMSsender(
			"������ �����մϴ�","������","02-0000-0000","10% ���������� ����Ǿ����ϴ�.");
		sms.sendMessage("010-000-0000");	// �޴� ���
		
//		MessageSender ms = new MessageSender)();
//		�߻� Ŭ������ �ν��Ͻ��� ������ �� ����. �߻� �޼��带 �����ϱ� ����
		

		}
}
