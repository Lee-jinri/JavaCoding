package ���;

// �θ�Ŭ����
public class Friend {
	// �ν��Ͻ� ���, �θ�Ŭ������ �ڽ�Ŭ������ ���������� ����� ����� �����Ѵ�. 
	protected String name;
	protected String phone;
	
	// ������
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	// �޼ҵ�
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phone);
	}

}
