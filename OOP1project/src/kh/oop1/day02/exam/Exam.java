package kh.oop1.day02.exam;

// ����� Ŭ���� : Ŭ���� �ȿ� main �޼ҵ尡 �����Ͽ� �����ϴ� Ŭ����
// ������� Ŭ���� : Ŭ���� �ȿ� �޼ҵ带 �߰��Ͽ� �ʿ��� ����� �����Ǿ��ִ� Ŭ����
public class Exam {
	// < Ŭ���� {���� , ������, �޼ҵ�} >
	// Ŭ���� ���������ڴ� public(+), (default)(~)�� ��� ����
	// public�� �ƹ������� ���� ���� default�� ���� ��Ű�� �������� ���� ����
	
	// * ����(�Ӽ��� ����)
	// [����������] [�����] �ڷ��� ������;
	// ���������� : public, protected, (default), private
	// ����� �� static, final
	private static int age;
	public static String name;
	
	// * ������
	public Exam() {}
	
	// * �޼ҵ�(��� ���� ����)
	// [����������] ��ȯ�� �޼ҵ��(�Ű�����){ ��� ���� }
	
	// 1. �Ű������� ���� �޼ҵ�
	public void printName() {  // ��ȣ�ȿ� �ƹ��͵� �� ������ �Ű������� ���� �޼ҵ�
		// �������
	}
	
	// 2. �Ű������� �ִ� �޼ҵ�
	public void printAge(int age) {
		// �������
	}
	
	CoffeeMachine cm = new CoffeeMachine();
	// �� Ŭ������ main(����Ŭ����)�� �ƴϱ⶧���� cm.�� ����� ������� ���Ѵ�
	// ����ϰ� ������
	// �ʱ�ȭ ��
	{
		System.out.println(cm.str1);
	}
	
	
	
	
}
