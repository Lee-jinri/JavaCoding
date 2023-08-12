package exam_interface_Lendable;

// 부록 CD 클래스
public class AppCDinfo extends CDinfo implements Lendable {
	
	
	private String borrower;
	private String checkOutDate;
	private int state;
	
	public AppCDinfo(String registerNo, String title) {
		super(registerNo, title);
	}
	
	public void checkOut (String borrower, String date) { // 대출한다
		if(state != 0) {
			System.out.println("현재 대여중");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + getTitle() + "CD가 대출되었습니다.");
		System.out.println("대출인 : " + this.borrower);
		System.out.println("대출일 : " + this.checkOutDate);
	}
	
	public void checkIn() {
		if(state == 0) {
			System.out.println("이미 반납 완료");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + getTitle() + "CD가 반납되었습니다.");
	}
}
