
public class Book {
	
	//�ʵ� ����
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
		return "å �̸� : " + bookName + ", ���ǻ� : " + bookPublisher + ", �帣 : " + genre;
	}
}
