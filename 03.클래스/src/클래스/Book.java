package Ŭ����;

public class Book {

	// �ʵ� ����
	public String bookNumber;  	  // å ��ȣ
	public String bookName;		  // å �̸�
	public String bookPublisher;  // ���ǻ��
	public int bookPrice; 		  // å ����

	// �ʵ尪�� �������ֱ� ���� �޼ҵ�
	public void bookData(String number, String name, String publisher, int price) {
		bookNumber = number;
		bookName = name;
		bookPublisher = publisher;
		bookPrice = price;
	}
	
	// �޼ҵ� ����
	public void display() {
		System.out.println("å ��ȣ: " +bookNumber+ "\nå �̸�: " +bookName+ "\n���ǻ��: " 
	+bookPublisher+ "\nå ����: " +bookPrice);
	}
	
	public String toString() {
		return String.format("å ��ȣ: %s\nå �̸�: %s\n���ǻ� ��: %s\nå ����: %d\n ",
							   bookNumber, bookName, bookPublisher, bookPrice);
	}

}
