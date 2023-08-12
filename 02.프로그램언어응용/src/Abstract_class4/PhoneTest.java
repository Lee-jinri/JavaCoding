package Abstract_class4;

abstract class Phone { // �θ�Ŭ����
	// �߻� Ŭ������ ���� �߻� Ŭ���� : ������ ��� Ŭ������ �̿��ϰڴ�.
	
	// �ʵ�
	public String owner;  // ����
	
	// ������
	public Phone(String owner) {
		this.owner = owner;
	}
	
	// �޼ҵ�
	public void turnOn() {
		System.out.println("�� ������ �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�� ������ ���ϴ�.");
	}
}

class SmartPhone extends Phone{ // �ڽ� Ŭ����
	// ������
	public SmartPhone(String owner) {
		super(owner);
	}
	
	//�޼ҵ� : ��ɱ���
	public void internetSearch() {
		System.out.println("���ͳ� �˻��� �մϴ�.");
	}
}

// ���� Ŭ����
public class PhoneTest	{
	public static void main(String[] args) {
		// Phone phone = new Phone(); (�߻�޼ҵ� �ν��Ͻ� ���� �Ұ���)
		
		SmartPhone smartphone = new SmartPhone("ȫ�浿");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
		

	}
}
