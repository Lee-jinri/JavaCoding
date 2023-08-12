package exam_interface_Lendable;

// �η� CD Ŭ����
public class AppCDinfo extends CDinfo implements Lendable {
	
	
	private String borrower;
	private String checkOutDate;
	private int state;
	
	public AppCDinfo(String registerNo, String title) {
		super(registerNo, title);
	}
	
	public void checkOut (String borrower, String date) { // �����Ѵ�
		if(state != 0) {
			System.out.println("���� �뿩��");
			return;
		}
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + getTitle() + "CD�� ����Ǿ����ϴ�.");
		System.out.println("������ : " + this.borrower);
		System.out.println("������ : " + this.checkOutDate);
	}
	
	public void checkIn() {
		if(state == 0) {
			System.out.println("�̹� �ݳ� �Ϸ�");
			return;
		}
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + getTitle() + "CD�� �ݳ��Ǿ����ϴ�.");
	}
}
