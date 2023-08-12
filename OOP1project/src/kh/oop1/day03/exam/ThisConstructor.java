package kh.oop1.day03.exam;

public class ThisConstructor {
	// This
	
	// 출판사 기능
	private String bookName;	// 책 이름
	private int bookprice;		// 책 가격
	private String bookpublisher;	// 출판사
	private int bookid; 			// 책 아이디
	
	
	// 기본생성자
	public ThisConstructor() {
		System.out.println("기본 생성자 입니다.");
	}
	
	// 매개변수가 있는 생성자 , 오버로딩, 같은 출판사 일 수도 있으니까용
	public ThisConstructor(String bookpublisher) {
		this.bookpublisher = bookpublisher;
		System.out.println("매개변수 하나");
	}
	// 매개변수가 여러개 있는 생성자, 오버로딩
	// 매개변수는 3개이지만 run클래스에서 4개가 출력됨
	public ThisConstructor(String bookName, int bookprice, int bookid) {
		this("kh정보교육원"); // 매개변수가 하나인 생성자, 다른 생성자보다 먼저 생성되기때문에 반드시 첫 줄에 작성해야함.
		this.bookName = bookName; 
		this.bookprice = bookprice;
		this.bookid = bookid;
	}
	
	// getter
	public String getBookName() {
		return bookName;
	}
	public int getBookprice() {
		return bookprice;
	}
	public String getbookpublisher() {
		return bookpublisher;
	}
	public int getBookid() {
		return bookid;
	}
}

