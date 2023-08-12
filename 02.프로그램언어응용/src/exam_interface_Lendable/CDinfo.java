package exam_interface_Lendable;

public class CDinfo {
	
	private String registerNo;	// 관련 번호
	private String title;		// 타이틀
	
	// 클래스명과 동일하게 정의. 리턴타입(반환형)이 없다
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
