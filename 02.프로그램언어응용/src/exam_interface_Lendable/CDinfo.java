package exam_interface_Lendable;

public class CDinfo {
	
	private String registerNo;	// ���� ��ȣ
	private String title;		// Ÿ��Ʋ
	
	// Ŭ������� �����ϰ� ����. ����Ÿ��(��ȯ��)�� ����
	public CDinfo (String registerNo, String title) {
		this.registerNo = registerNo;
		this.title = title;
	}
	
	public String getRegisterNo() {
		return registerNo;
	}
	
	public void setRegisterNo(String registerNo) {
		this.registerNo = registerNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	
	
	
	
	
}
