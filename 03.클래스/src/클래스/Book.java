package 클래스;

public class Book {

	// 필드 정의
	public String bookNumber;  	  // 책 번호
	public String bookName;		  // 책 이름
	public String bookPublisher;  // 출판사명
	public int bookPrice; 		  // 책 가격

	// 필드값을 설정해주기 위한 메소드
	public void bookData(String number, String name, String publisher, int price) {
		bookNumber = number;
		bookName = name;
		bookPublisher = publisher;
		bookPrice = price;
	}
	
	// 메소드 정의
	public void display() {
		System.out.println("책 번호: " +bookNumber+ "\n책 이름: " +bookName+ "\n출판사명: " 
	+bookPublisher+ "\n책 가격: " +bookPrice);
	}
	
	public String toString() {
		return String.format("책 번호: %s\n책 이름: %s\n출판사 명: %s\n책 가격: %d\n ",
							   bookNumber, bookName, bookPublisher, bookPrice);
	}

}
