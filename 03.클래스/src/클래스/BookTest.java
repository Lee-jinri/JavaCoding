package 클래스;

public class BookTest {
	public static void main(String[] args) {
		
		// 1번째 객체
		Book myBook = new Book();
		
		// 값 대입
		// 방법 1
		myBook.bookName = "Dream";
		myBook.bookNumber = "12345678";
		myBook.bookPublisher = "출판사";
		myBook.bookPrice = 5000;
		
		// 방법 2
//		myBook.bookData("Dream", "12345678", "출판사", 5000);
		
		// 출력
//		myBook.display();
		System.out.println(myBook.toString());
		
		System.out.println();
		
		// 2번째 객체
		Book yourBook = new Book();
		
		// 값 대입
		// 방법 1
		yourBook.bookName = "Hey";
		yourBook.bookNumber = "23456789";
		yourBook.bookPublisher = "제 2 출판사";
		yourBook.bookPrice = 10000;
		
		// 방법 2 
//		yourBook.bookData("Hey","23456789" , "제 2 출판사", 10000);
		
		// 출력
//		yourBook.display();
		System.out.println(yourBook.toString());
		
		
		
		
		
		
		
		
		
		
		
	}
}
