
public class Book {
	
	//필드 정의
	public String bookPublisher;
	public String bookName;
	public String genre;
	
	public void setBookPublisher(String BookPublisher) {
		bookPublisher = BookPublisher;
	}
	public void setBookName(String BookName) {
		bookName = BookName;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String toString() {
		return "책 이름 : " + bookName + ", 출판사 : " + bookPublisher + ", 장르 : " + genre;
	}
}
