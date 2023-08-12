package kh.oop1.day02.exam;

public class FieldExam {
	
	// �ʵ�
	// [����������] [�����] �ڷ��� ������ [=�ʱⰪ];
	
	// Ŭ���� ����(��� ��ü�� ���������� �Ӽ��� ���� �� ����ϰ� ������ �� �޸𸮿����� ���� �����Ǳ� ������
	// �� �ʿ��� �������� �Ӽ��� ���� ������ ����� �ؾ��մϴ�.
	// 1. Ŭ���� ���� : static Ű���带 ������ �ʵ忡 ����
	// 				 �޸��� static ������ ���
	public static int var1;
	
	// ��� ����(�ν��Ͻ� ����)
	// ������ ��ü(�ν��Ͻ�)���� �������� �Ӽ��� ������ �� �� ���
	// 2. ��� ����(�ν��Ͻ� ����) : static Ű���� X
	//							�޸��� heap���� ���
	public int var2;
	private int var3; // ĸ��ȭ ��Ģ���� private���, ����Ŭ�������� �����Ϸ��� get, set ����ؾ� ��.
	int var4; // ���������� ������ default ����������
	
	
	// 3. ���� ���� : �޼ҵ�, ������, �ʱ�ȭ��� ���ο��� ����
	//				�޸��� stack ���� ���
	// ������
	public FieldExam() {
		String var5 = "������ ��������"; 
		System.out.println(var5);
	}
	
	// �ʱ�ȭ ��
	{
		String var6 = "�ʱ�ȭ �� ��������";
		System.out.println(var6);
	}
	
	// �޼ҵ�
	public String method() {
		String var7 = "�޼ҵ���� ��������";
		return var7;
	}
	public static String method1() {
		String var8 = "static ���� ��������";
		return var8;
	}
	
}
