package Abstract_class3;

public class SMSsender extends MessageSender {
	
	private String returnPhoneNo;
	private String message;
	
	// ������ ??? �� �����ϱ�
	// ������ Ŭ�����̸� (�Ű�����)
	public SMSsender(String title, String senderName, String returnPhoneNo, String message) {  // �ʵ� �ʱ�ȭ
		super(title, senderName);  // �θ� Ŭ������ ������ ȣ��
		this.returnPhoneNo = returnPhoneNo;
		this.message = message;
	}
	
	@Override
	public void sendMessage(String recipient) {
		System.out.println("---------------------------");
		System.out.println("���� : " + getTitle());
		System.out.println("������ ��� : " + getSenderName());
		System.out.println("��ȭ��ȣ : " + recipient);
		System.out.println("ȸ�� ��ȭ��ȣ : " + returnPhoneNo);
		System.out.println("�޽��� ���� : " + message);
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
