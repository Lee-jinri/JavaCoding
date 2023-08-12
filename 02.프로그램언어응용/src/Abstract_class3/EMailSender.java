package Abstract_class3;

public class EMailSender extends MessageSender {  // �߻�Ŭ���� ���
	
	private String senderAddr;	// �߼��� �̸�
	private String emailBody;	// �̸��� ����
	
	
	public EMailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);  // �θ� Ŭ������ ������ ȣ��
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}
	
	@Override
	public void sendMessage(String recipient) { // �߻�޼��� ����������, ������ �θ� Ŭ������ �߻� �޼���� �����ؾ���
		System.out.println("--------------------------");
		System.out.println("���� : " + getTitle());
		System.out.println("������ ��� : " + getSenderName() + " " + senderAddr);
		System.out.println("�޴� ��� : " + recipient);
		System.out.println("���� : " + emailBody);
	}
	
	public String getsenderAddr() {  // ������
		return senderAddr;
	}
	
	public void setsenderAddr(String senderAddr) {
		this.senderAddr = senderAddr;
	}
	
	public String getemailBody() {
		return emailBody;
	}
	
	public void setMajor(String emailBody) {  // ������
		this.emailBody = emailBody;
	}

	
}
