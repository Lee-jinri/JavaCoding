package exam_interface_phone;

// �� ���� �������̽� ����
public class GalaxyMessenger implements Messenger, WorkFile {
	
	// ���� Ŭ����
	
	@Override
	public String getMessage() {
		return "galaxy";
	}
	
	@Override
	public void setMessage(String msg) {
		System.out.println("galaxy���� �޽����� �����մϴ� : " + msg);
	}
	
	public void changeKeyboard() {
		System.out.println("Ű���� ������ ��ġ �� Ű���带 �����մϴ�");
	}
	
	@Override
	public void fileUpload() {
		System.out.println("file�� ���ε��մϴ�.");
	}
	
	@Override
	public void fileDownload() {
		System.out.println("file�� �ٿ�ε��մϴ�.");
	}
	
}
