package Ŭ����;

public class BookTest {
	public static void main(String[] args) {
		
		// 1��° ��ü
		Book myBook = new Book();
		
		// �� ����
		// ��� 1
		myBook.bookName = "Dream";
		myBook.bookNumber = "12345678";
		myBook.bookPublisher = "���ǻ�";
		myBook.bookPrice = 5000;
		
		// ��� 2
//		myBook.bookData("Dream", "12345678", "���ǻ�", 5000);
		
		// ���
//		myBook.display();
		System.out.println(myBook.toString());
		
		System.out.println();
		
		// 2��° ��ü
		Book yourBook = new Book();
		
		// �� ����
		// ��� 1
		yourBook.bookName = "Hey";
		yourBook.bookNumber = "23456789";
		yourBook.bookPublisher = "�� 2 ���ǻ�";
		yourBook.bookPrice = 10000;
		
		// ��� 2 
//		yourBook.bookData("Hey","23456789" , "�� 2 ���ǻ�", 10000);
		
		// ���
//		yourBook.display();
		System.out.println(yourBook.toString());
		
		
		
		
		
		
		
		
		
		
		
	}
}
