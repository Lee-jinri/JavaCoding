package exam_interface_Lendable;

public class SeparateVolume implements Lendable { // ���ົ

	// �ν��Ͻ� ����, �ʱ�ȭ �� �� ����.
	private String requestNo;
	private String bookTitle;
	private String writer;
	private String borrower;
	private String checkOutDate;
	private int state;  // ������� 0�̸� �뿩 �� 1�̸� ���� ��
	
	// å�� ������ 
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	public void checkOut(String borrower, String date) { // ����޼���
		if (state != 0)		// �뿩���̶��
			return;			// return; - �����ϰ� �ٷ� �����ݷ��̸� �޼��带 ������ �����ϰڴٴ� ��
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + bookTitle + "(" + writer + ") ��(��) ����Ǿ����ϴ�." );
		System.out.println("������ : " + this.borrower);
		System.out.println("������ : " + this.checkOutDate + "\n");
	}
	
	
	public void checkIn() {
		if(state == 0) {
			System.out.println("�̹� �ݳ� ó���� �Ϸ�Ǿ����ϴ�.");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�. \n");
	
	}
	
	
	public String toString() {
		return "���ົ ���� [û����ȣ : : " + requestNo + ", å���� : " + bookTitle + ", ���� : " + writer + "]";
		
	}
	
	
	
	
	
	
	
	
	
	
	

	
	


}
