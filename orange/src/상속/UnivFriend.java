package ���;

// �ڽ�Ŭ���� 
public class UnivFriend extends Friend {
	
	// �ν��Ͻ� ����
	// ģ���� ���� ���� ���Դ���
	private String major;

	// ������
	public UnivFriend(String name, String major, String phone) {
		// �θ�Ŭ������ ������
		super(name,phone);
		this.major = major;
	}
	
	// �޼ҵ� �������̵�
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("���� : " + major);
	}

}
