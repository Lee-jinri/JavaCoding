package basic;

// Man : �θ�Ŭ����, BusinessMan : �ڽ�Ŭ����
public class BusinessMan extends Man {
	// �ν��Ͻ� ����
	String company;
	String position;
	
	// ������ : BusinessMan�� Man�� �ν��Ͻ� ������ name�� �ʱ�ȭ ������Ѵ�.
	public BusinessMan(String name, String company, String position) {
		// ����Ŭ������ �ν��Ͻ� ������ �ʱ�ȭ �ϴ� �� : super(������);
		super(name);
		// ����Ŭ������ �ν��Ͻ� ���� �ʱ�ȭ
		this.company = company;
		this.position = position;
		
	}
	
	// �޼ҵ�
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}
}

class MyBusinessMan{
	public static void main(String args[]) {
		BusinessMan man = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");
		man.tellYourInfo();
	}
}
