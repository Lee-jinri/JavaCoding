package ���;

public class CompFriend extends Friend{
	
	// �ν��Ͻ� ����
	// ��� �μ�����
	private String department;
	
	// ������
	public CompFriend(String name,String phone,String department) {
		super(name,phone);
		this.department = department;
	}
	
	// �޼ҵ�������
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("�μ� : " + department);
	}
}
