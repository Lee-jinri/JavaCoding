package exam_interface_Lendable;

public class SeparateVolume implements Lendable { // 단행본

	// 인스턴스 생성, 초기화 안 돼 있음.
	private String requestNo;
	private String bookTitle;
	private String writer;
	private String borrower;
	private String checkOutDate;
	private int state;  // 대출상태 0이면 대여 중 1이면 대출 중
	
	// 책의 정보만 
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	public void checkOut(String borrower, String date) { // 대출메서드
		if (state != 0)		// 대여중이라면
			return;			// return; - 리턴하고 바로 세미콜론이면 메서드를 강제로 종료하겠다는 뜻
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + bookTitle + "(" + writer + ") 이(가) 대출되었습니다." );
		System.out.println("대출인 : " + this.borrower);
		System.out.println("대출일 : " + this.checkOutDate + "\n");
	}
	
	
	public void checkIn() {
		if(state == 0) {
			System.out.println("이미 반납 처리가 완료되었습니다.");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + bookTitle + " 이(가) 반납되었습니다. \n");
	
	}
	
	
	public String toString() {
		return "단행본 정보 [청구번호 : : " + requestNo + ", 책제목 : " + bookTitle + ", 저자 : " + writer + "]";
		
	}
	
	
	
	
	
	
	
	
	
	
	

	
	


}
