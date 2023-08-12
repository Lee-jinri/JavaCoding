package kh.oop1.day03.exam;

public class ThisConstructor {
	// This
	
	// ���ǻ� ���
	private String bookName;	// å �̸�
	private int bookprice;		// å ����
	private String bookpublisher;	// ���ǻ�
	private int bookid; 			// å ���̵�
	
	
	// �⺻������
	public ThisConstructor() {
		System.out.println("�⺻ ������ �Դϴ�.");
	}
	
	// �Ű������� �ִ� ������ , �����ε�, ���� ���ǻ� �� ���� �����ϱ��
	public ThisConstructor(String bookpublisher) {
		this.bookpublisher = bookpublisher;
		System.out.println("�Ű����� �ϳ�");
	}
	// �Ű������� ������ �ִ� ������, �����ε�
	// �Ű������� 3�������� runŬ�������� 4���� ��µ�
	public ThisConstructor(String bookName, int bookprice, int bookid) {
		this("kh����������"); // �Ű������� �ϳ��� ������, �ٸ� �����ں��� ���� �����Ǳ⶧���� �ݵ�� ù �ٿ� �ۼ��ؾ���.
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

